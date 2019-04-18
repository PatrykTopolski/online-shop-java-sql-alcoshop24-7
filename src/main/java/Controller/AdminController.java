package Controller;

import java.sql.SQLException;
import java.util.*;
import Model.Product;
import Model.User;
import Model.Order;
import View.AdminView;

public class AdminController{
    private AdminDAOImpl adminDAO = new AdminDAOImpl();


    public List<Product> getAllProducts() throws SQLException{
        return adminDAO.getAllProducts();
    }

    public List<User> getAllCustomers() throws  SQLException{
        return  adminDAO.getAllCustomers();
    }

    public void refillTheStock(Product product, int amount) throws  SQLException{
        adminDAO.refillTheStock(product, amount);
    }

    public void CreateProduct(Product product) throws SQLException {
        adminDAO.createNewProduct(product);
    }

    public List<Order> getAllOrders() throws  SQLException{
        return adminDAO.getOrders();
    }

    public int askAdminForActivity(){
        AdminView view = new AdminView();
        String ask = "1. Show me the table \n 2. show me customers \n 3. refill the stock \n 4. add new product \n 5. show me orders \n 6.Quit";
        int answer = view.getIntAnswer(ask);
        return answer;
    }

}