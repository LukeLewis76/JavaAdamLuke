import java.util.List;

public class Client
{
    private String clientId;
    private String firstName;
    private String lastName;
    private int ssn;
    private String dob;
    private Boolean current;
    private String skillSet;

    public Client(String clientId, String firstName, String lastName, int ssn, String dob, Boolean current,
                  String skillSet)
    {
        this.clientId = clientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.dob = dob;
        this.current = current;
        this.skillSet = skillSet;
    }

    public String getClientId()
    {
        return clientId;
    }

    public String getDob()
    {
        return dob;
    }

    public Boolean getCurrent()
    {
        return current;
    }

    public String getSkillSet()
    {
        return skillSet;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getSsn()
    {
        return ssn;
    }

    @Override
    public String toString()
    {
        return "Client{" +
                "clientId='" + clientId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ssn=" + ssn +
                ", dob='" + dob + '\'' +
                ", current=" + current +
                ", skillSet=" + skillSet +
                '}' + "\n";
    }
}
