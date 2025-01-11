import client.Client;
import services.ClientService;

import java.sql.SQLException;

public class create {
    public static void main(String[] args) throws SQLException {

        ClientService clientService = new ClientService();
        Client client = new Client("Bob",41);

        clientService.saveClient(client);

    }
}