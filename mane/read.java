import services.ClientService;
public class read {
    public static void main(String[] args) {
try{
        ClientService clientService = new ClientService();
        System.out.println(clientService.findClient(33));}
catch(Exception e){
    System.out.println("Error: " + e);
    e.printStackTrace();
}

    }
}
