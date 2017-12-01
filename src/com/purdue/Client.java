package com.purdue;

public class Client
{
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String city;
    private String gender;
    private String state;
    private int zip;
    private int ssn;
    private String phone;
    private String email;
    private String clientId;
    private Boolean current;
    private String skillSet;

    public Client(String firstName, String lastName, int age, String address, String city, String gender, String state,
                  int zip, int ssn, String phone, String email, String clientId, Boolean current, String skillSet)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.city = city;
        this.gender = gender;
        this.state = state;
        this.zip = zip;
        this.ssn = ssn;
        this.phone = phone;
        this.email = email;
        this.clientId = clientId;
        this.current = current;
        this.skillSet = skillSet;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getAge()
    {
        return age;
    }

    public String getAddress()
    {
        return address;
    }

    public String getCity()
    {
        return city;
    }

    public String getGender()
    {
        return gender;
    }

    public String getState()
    {
        return state;
    }

    public int getZip()
    {
        return zip;
    }

    public int getSsn()
    {
        return ssn;
    }

    public String getPhone()
    {
        return phone;
    }

    public String getEmail()
    {
        return email;
    }

    public String getClientId()
    {
        return clientId;
    }

    public Boolean getCurrent()
    {
        return current;
    }

    public String getSkillSet()
    {
        return skillSet;
    }

    @Override
    public String toString()
    {
        return "com.purdue.Client{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", gender='" + gender + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", ssn=" + ssn +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", clientId=" + clientId +
                ", current=" + current +
                ", skillSet='" + skillSet + '\'' +
                '}';
    }
}
