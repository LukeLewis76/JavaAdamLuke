public class Client
{
    private int clientId;
    private String firstName;
    private String lastName;
    private int ssn;
    private String dob;
    private String skill;

    public Client(int clientId, String firstName, String lastName, int ssn, String dob, String skill)
    {
        this.clientId = clientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.dob = dob;
        this.skill = skill;
    }


    public int getClientId()
    {
        return clientId;
    }

    public String getDob()
    {
        return dob;
    }


    public String getSkillSet()
    {
        return skill;
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
                lastName + ", " + firstName + ", dob=" + dob +
                ", skill=" + skill +
                '}';
    }
}
