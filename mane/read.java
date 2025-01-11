import client.Client;
import services.ClientService;

import java.sql.SQLException;

public class read {
    public static void main(String[] args) throws SQLException {

        ClientService clientService = new ClientService();
        System.out.println(clientService.findClient(9));

    }
}
