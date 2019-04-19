package Controller;

import java.sql.SQLException;
import java.util.*;
import Model.Product;
import Model.User;
import Model.Order;
import View.AdminView;


public class Controller{
    private  ControllerDaoImpl mainCotrillerDao = new ControllerDaoImpl();
    private AdminView adminView = new AdminView();
    private AdminController admin = new AdminController();
    boolean adminConsoleHandler = true;

    public void handleShop() throws SQLException{

        String login = adminView.getStringAnswer("Enter your login: ");
        String password = adminView.getStringAnswer("Enter your password: ");
        int adminType = 1;
        int customerType = 2;

        int userType = mainCotrillerDao.getUserType(login, password);

        if(userType == adminType){
            while (adminConsoleHandler){
                handleAdmin();
            }
        }else if (userType == customerType){
            System.out.println("im customer");
        }else {
            System.out.println("wrong login or password");
        }

    }

    private void handleAdmin() throws SQLException{
        int answer = admin.askAdminForActivity();
        if(answer == 1){
            List<Product> products = admin.getAllProducts();
            adminView.printAllProducts(products);
        }else if (answer == 2){
            List<User> users = admin.getAllCustomers();
            adminView.printAllCustomers(users);
        }else if (answer == 3){
            List<Product> products = admin.getAllProducts();
            int productID = adminView.getIntAnswer("Enter product ID: ");
            int quantiti = adminView.getIntAnswer("Enter new stock size: ");
            if (productID -1 != products.size()){
                admin.refillTheStock(products.get(productID-1), quantiti);
            }else {
                System.out.println("no such item in the stock");
            }
        }else if(answer == 4){
            System.out.println("todo");
        }else if(answer == 5){
            List<Order> orders = admin.getAllOrders();
            adminView.printAllOrders(orders);
        }else if(answer == 6){
            adminConsoleHandler = false;
        } else {
            System.out.println("Enter valid number!");
        }
    }



}