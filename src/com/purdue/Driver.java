import java.sql.SQLException;

public class Driver
{
    public static void main(String[] args)
    {
        Gui obj = new Gui();

        try
        {
            ClientFactory clientFactory = new ClientFactory();

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}

