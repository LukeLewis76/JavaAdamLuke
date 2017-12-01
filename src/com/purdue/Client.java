public class Client
{
    private String clientId;
    private String firstName;
    private String lastName;
    private int ssn;
    private String dob;
    private Boolean current;
    private String skillSet;

    public Client(String clientId)
    {
        this.clientId = clientId;
        current = true;
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
        return "clientId:" + clientId + '\t' +
                "firstName: " + firstName + '\t' +
                "lastName: " + lastName + '\t' +
                "ssn: " + ssn + '\t' +
                "dob: " + dob;
    }
}
