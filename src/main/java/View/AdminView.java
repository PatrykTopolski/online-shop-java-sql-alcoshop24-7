package View;

import Model.Customer;
import Model.Product;
import Model.Order;
import Model.User;

import java.util.List;

public class AdminView {
    public void printAllProducts(List<Product> products){
        for (Product product: products
             ) {
            System.out.println("ID: " + product.getId() +", " + "name: " + product.getName()+", "  + "vol(%): " + product.getAlcoholContent() +", "  + "Amount: " +
                    product.getAmount()+", "  + "vol(l)" + product.getVolume()+", "  + "price: " + product.getPrice());
        }
    }

    public void printAllCustomers(List<User> customers){
        for (User user: customers
             ) {
            System.out.println("ID: " + user.getId() + ", Login: " + user.getLogin() + ", Password: " + user.getPassword());
        }
    }

    public void printAllOrders(List<Order> orders){
        for (Order order: orders
             ) {
            System.out.println("ID: " + order.getID() + ", BasketID: " + order.getBasketID()+ ", CustomerID: " + order.getUserID());
        }
    }
}
