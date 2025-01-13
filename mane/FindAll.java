
import services.ClientService;
public class FindAll {
    public static void main(String[] args) {
      try {
          ClientService clientService = new ClientService();
          System.out.println(clientService.findAllClients());
      }catch (Exception e) {
          System.out.println("Error: " + e);
          e.printStackTrace();
      }
    }
}
