import client.Client;
import services.ClientService;

import java.sql.SQLException;

public class delete {
    public static void main(String[] args) throws SQLException {

        ClientService clientService = new ClientService();

        clientService.deleteClient(clientService.findClient(9));

    }
}