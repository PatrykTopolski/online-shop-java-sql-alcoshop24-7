package Controller;

import java.sql.SQLException;
import java.util.*;
import Model.Product;

public class Controller{

    public void handleShop() throws SQLException{
        AdminController admin = new AdminController();

        List<Product> allProducts = new ArrayList<>(admin.getAllProducts());

        for(Product product : allProducts){
            System.out.println(product.getName());
        }
    }
}