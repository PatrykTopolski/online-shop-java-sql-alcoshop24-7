package Controller;

import java.sql.SQLException;
import java.util.*;
import Model.Product;
import Model.User;
import Model.Order;
import View.AdminView;

public class Controller{

    public void handleShop() throws SQLException{
        AdminController admin = new AdminController();

        List<Product> allProducts = new ArrayList<>(admin.getAllProducts());
        List<User> allCustomers = new ArrayList<>(admin.getAllCustomers());
        List<Order> allOrders = new ArrayList<>(admin.getAllOrders());
        AdminView adminView = new AdminView();

        adminView.printAllProducts(allProducts);


        adminView.printAllCustomers(allCustomers);

        adminView.printAllOrders(allOrders);




    }
}