package Controller;

import java.sql.SQLException;
import java.util.*;

import Model.Order;
import Model.Product;

public class CustomerController{
    CustomerDAOImpl dao = new CustomerDAOImpl();

    public List<Product> getAllProducts() throws SQLException{
        return dao.getAllProducts();
    }

    public List<Order> getOrders(int customerID)throws SQLException{
        return dao.getOrders(customerID);
    }

    public Order getOrder(int orderID)throws SQLException{
        return dao.getOrder(orderID);
    }

    public Product getProductById(int productID){
        return dao.getProductById(productID);
    }

    public void makeNewOrder(int ID, int basketID, int userID){
        dao.makeNewOrder(ID, basketID, userID);
    }


}