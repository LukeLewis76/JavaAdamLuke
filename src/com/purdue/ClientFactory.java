import java.util.*;

public class ClientFactory
{
    private static ClientFactory myCf = new ClientFactory();

    private Map<String, Client> clientMap;
    private List<Client> currentList;
    private int count = 0;

    private ClientFactory()
    {
        count = 0;

        clientMap = new HashMap<>();
        currentList = new ArrayList<>();
    }

    public static ClientFactory getInstance()
    {
        return myCf;
    }

    public Client addClientToMap(String clientId)
    {
        if(clientMap.containsKey(clientId))
        {
            return clientMap.get(clientId);
        }
        else
        {
            Client c = new Client(clientId);
            clientMap.put(clientId,c);
            return c;
        }
    }

    public void checkIn(String clientId)
    {
        Client c = addClientToMap(clientId);
        currentList.add(c);
        count++;
        System.out.println("Client " + clientId + " Checked In");
    }

    public void checkOut(String clientId)
    {
        Client c = addClientToMap(clientId);
        currentList.remove(c);
        count--;
        System.out.println("Client " + clientId + " Checked Out");
    }

    public Collection<Client> getClientInMap()
    {
        return clientMap.values();
    }

    public int getCount()
    {
        return count;
    }
}
