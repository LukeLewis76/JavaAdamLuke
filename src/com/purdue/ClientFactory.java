import java.sql.*;
import java.util.*;

public class ClientFactory
{
    public static String url = "jdbc:sqlite:c:/files/JavaRocks.db";
    String sqlQuery = "SELECT * FROM Clients";
    static Map<String, Client> clientMap = new TreeMap<>();

    private static int clientId ;
    private String firstName;
    private String lastName;
    private int ssn;
    private String dob;
    private String skill;

    public ClientFactory() throws SQLException
    {
        try
        (
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sqlQuery)
        )
        {
            while (rs.next())
            {
                clientId = rs.getInt("clientId");
                firstName = rs.getString("FirstName");
                lastName = rs.getString("LastName");
                ssn = rs.getInt("SSN");
                dob = rs.getString("DOB");
                skill = rs.getString("Skill");

                clientMap.put(lastName, new Client(clientId, firstName, lastName, ssn, dob, skill));

//                System.out.println(firstName + "\t " + lastName + "\t " + dob);
            }

        }
        catch (SQLException e)
        {
            System.out.println("SQL ERROR:" + e.getMessage());

            createTable();
        }
    }

    public static void createTable()
    {
        String sql = "CREATE TABLE Clients(clientId integer  PRIMARY KEY, FirstName text NOT NULL, LastName text NOT NULL," +
                " SSN int, DOB text, Skill text);";
        try (
                Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()
        )
        {
            stmt.execute(sql);
            System.out.println("Table CREATED: Clients");
            initialise();
        } catch (SQLException e)
        {
//            System.out.println(e.getMessage());
        }
    }
    public static void initialise()
    {
        String sql = "INSERT INTO Clients values(?,?,?,?,?,?);";
        try(
                Connection conn = DriverManager.getConnection(url);
                PreparedStatement stmt = conn.prepareStatement(sql)
        )
        {
            stmt.setInt(1,1);
            stmt.setString(2,"firstName");
            stmt.setString(3,"lastName");
            stmt.setInt(4,123456789);
            stmt.setString(5,"dob");
            stmt.setString(6,"skill");
            stmt.execute();
            System.out.println("Inserted into: Clients");
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void insert(String firstName, String lastName, int ssn, String dob,
                              String skill) throws SQLException
    {
        String sql = "INSERT INTO Clients values(?,?,?,?,?,?);";
        try(
                Connection conn = DriverManager.getConnection(url);
                PreparedStatement stmt = conn.prepareStatement(sql)
        )
        {
            stmt.setString(2,firstName);
            stmt.setString(3,lastName);
            stmt.setInt(4,ssn);
            stmt.setString(5,dob);
            stmt.setString(6,skill);
            stmt.execute();
            System.out.println("Inserted into: Clients");

            clientMap.put(lastName, new Client(clientId, firstName, lastName, ssn, dob, skill));

            Set set = clientMap.entrySet();
            Iterator itty = set.iterator();
            while (itty.hasNext())
            {
                Map.Entry cList = (Map.Entry)itty.next();
                System.out.println(cList.getValue());
            }
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
}

