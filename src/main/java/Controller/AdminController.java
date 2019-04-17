package Controller;

import java.sql.SQLException;
import java.util.*;
import Model.Product;
import Model.User;

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

}