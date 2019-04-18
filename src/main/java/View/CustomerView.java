package View;

import java.util.List;
import java.util.ArrayList;
import Model.Order;
import Model.Product;

public class CustomerView{

    public void printOrders(List<Order> orders){
        for (Order order:orders
             ) {System.out.println(order.toString());
        }
    }

    public void printProduct(Product product){
        System.out.println(product.toString());
    }

    public void printProducts(List<Product> products){
        for (Product product:products){
            System.out.println(product.toString());
        }
    }

    public void printMenu(){
        System.out.println("1. See all products");
        System.out.println("2. See all your orders");
        System.out.println("3. See chosen product");


    }
}