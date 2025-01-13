import client.Client;
import services.ClientService;
public class update {
    public static void main(String[] args) {
try{
        ClientService clientService = new ClientService();
        Client client = clientService.findClient(33);
        client.setName("John Doe");
        client.setAge(45);
        clientService.updateClient(client);}
catch(Exception e) {
    System.out.println("Error: " + e);
    e.printStackTrace();
}
    }
}