package servelets;

import client.Client;
import services.ClientService;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class UserSimpleServlet extends HttpServlet {

    private ClientService clientService = new ClientService();

    public void init(ServletConfig servletConfig) {
        try {
            super.init(servletConfig);
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Client> client = clientService.findAllClients();
        req.setAttribute("Client",client);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/showClient.jsp");
        dispatcher.forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        Client client = new Client( name, age);
        clientService.saveClient(client);
        resp.sendRedirect("/Client");

    }

    @Override
    protected void  doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Client client = clientService.findClient(id);
        client.setName(req.getParameter("name"));
        client.setAge(Integer.parseInt(req.getParameter("age")));
        clientService.updateClient(client);
        resp.sendRedirect("/Client");
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        clientService.deleteClient(clientService.findClient(id));
        resp.sendRedirect("/Client");
    }
}
