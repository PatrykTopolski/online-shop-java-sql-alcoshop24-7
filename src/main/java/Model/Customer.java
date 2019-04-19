package Model;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
    private Order order;
    private List<Order> orders;

    public Customer(int id, int userTypeId, String login, String password) {
        super(id, userTypeId, login, password);
        orders = new ArrayList<>();


    }
}
