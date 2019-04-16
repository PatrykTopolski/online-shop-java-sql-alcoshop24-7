package View;

import Model.Product;
import Model.User;
import Model.Customer;

import java.util.List;


public class View{

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printProductList(List<Product> products){
        for (Product product: products) {
            System.out.println(product);

        }
    }

    public void printCustomerList(List<Customer> customers){
        for (User customer : customers) {
            System.out.println(customer);
        }
    }


}