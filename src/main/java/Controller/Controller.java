package Controller;

import java.sql.SQLException;
import java.util.*;

import Model.Customer;
import Model.Product;
import View.CustomerView;


public class Controller{
    private CustomerController customerController = new CustomerController();
    private CustomerView customerView = new CustomerView();

    public void handleCustomer() throws SQLException{
        customerView.printMenu();
        int answer = customerView.getIntAnswer("Choose option from menu");

        if (answer == 1){
            customerView.printProducts(customerController.getAllProducts());
        }
//        else if(answer == 2){
//            customerView.printOrders(customerController.getOrders());
            //potrzeba jakos dostac sie do id customera z poziomu controllera
        //}
        else if (answer == 3){
            int chosenID = customerView.getIntAnswer("Choose ID to see product");
            customerView.printProduct(customerController.getProductById(chosenID));
        }


    }


}