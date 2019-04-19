package Controller;

import java.sql.SQLException;
import java.util.*;

import Model.Customer;
import Model.User;
import Model.Order;
import Model.Product;
import View.AdminView;
import View.CustomerView;



public class Controller{
    private  ControllerDaoImpl mainCotrillerDao = new ControllerDaoImpl();
    private AdminView adminView = new AdminView();
    private AdminController admin = new AdminController();
    boolean adminConsoleHandler = true;
    private CustomerController customerController = new CustomerController();
    private CustomerView customerView = new CustomerView();
    private boolean customerConsoleHandler = true;
    String login = "";
    String password = "";

    public void handleShop() throws SQLException{

        login = adminView.getStringAnswer("Enter your login: ");
        password = adminView.getStringAnswer("Enter your password: ");
        int adminType = 1;
        int customerType = 2;

        int userType = mainCotrillerDao.getUserType(login, password);

        if(userType == adminType){
            while (adminConsoleHandler){
                handleAdmin();
            }
        }else if (userType == customerType){
            while(customerConsoleHandler){handleCustomer();}
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
            System.out.println("developer was lazy, no adding product for now");
        }else if(answer == 5){
            List<Order> orders = admin.getAllOrders();
            adminView.printAllOrders(orders);
        }else if(answer == 6){
            adminConsoleHandler = false;
        } else {
            System.out.println("Enter valid number!");
        }
    }

    private void handleCustomer() throws SQLException{
        Customer currentCustomer = new Customer(2, 2, login, password);
        customerView.printMenu();
        int answer = customerView.getIntAnswer("Choose option from menu");

        if (answer == 1){
            customerView.printProducts(customerController.getAllProducts());
        }
        else if(answer == 2){
            List<Order> ordersToPrint = customerController.getOrders(currentCustomer.getId());
            customerView.printOrders(ordersToPrint);
        }
        else if (answer == 3){
            int chosenID = customerView.getIntAnswer("Choose ID to see product");
            List<Product> listTosearch = customerController.getAllProducts();
            customerView.printProductByID(listTosearch, chosenID);
        }


    }

}