package Controller;

import java.sql.SQLException;
import java.util.*;
import Model.Product;
import Model.User;

public class Controller{

    public void handleShop() throws SQLException{
        AdminController admin = new AdminController();

        List<Product> allProducts = new ArrayList<>(admin.getAllProducts());
        List<User> allCustomers = new ArrayList<>(admin.getAllCustomers());



        for(Product product : allProducts){
            System.out.println(product.getName());
        }

        Product productToChange = allProducts.get(5);
        admin.refillTheStock(productToChange, 500);

        admin.CreateProduct(productToChange);

        for(User customer : allCustomers){
            System.out.println(customer.getLogin());
        }
    }
}