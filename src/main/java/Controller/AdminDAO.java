package Controller;


import java.sql.SQLException;
import java.util.List;
import Model.Category;

import Model.Product;
import Model.User;
import Model.Order;

public interface AdminDAO {
    //TODO throws custom exception
    List<Product> getAllProducts() throws SQLException;
    List<User> getAllCustomers() throws  SQLException;
    void refillTheStock(Product product, int amount) throws SQLException;
    void addCategory(Category category) throws  SQLException;
    void createNewProduct(Product product) throws  SQLException;
    List<Order> getOrders() throws  SQLException;
    void deactivateProduct(Product product) throws  SQLException;
    void deactivateProductIf0() throws  SQLException;
}