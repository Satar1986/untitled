import services.ClientService;
public class delete {
    public static void main(String[] args) {
try{
        ClientService clientService = new ClientService();
        clientService.deleteClient(clientService.findClient(23));}
catch(Exception e){
    System.out.println("Error: " + e);
    e.printStackTrace();
}

    }
}