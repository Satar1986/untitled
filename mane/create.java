import client.Client;
import services.ClientService;
public class create {
    public static void main(String[] args) {
try {
        ClientService clientService = new ClientService();
        Client client = new Client("Lora",41);
        clientService.saveClient(client);}
catch (Exception e) {
    System.out.println("Error: " + e);
    e.printStackTrace();
}

    }
}