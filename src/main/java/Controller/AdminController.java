package Controller;

import java.sql.SQLException;
import java.util.*;
import Model.Product;

public class AdminController{
    private AdminDAOImpl adminDAO = new AdminDAOImpl();


    public List<Product> getAllProducts() throws SQLException{
        return adminDAO.getAllProducts();
    }


}