import client.Client;
import services.ClientService;

import java.sql.SQLException;

public class update {
    public static void main(String[] args) throws SQLException {

        ClientService clientService = new ClientService();
      Client client=  new Client("Lora",56);
       clientService.updateClient(clientService.findClient(11));

    }
}