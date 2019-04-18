package Controller;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import Controller.CustomerDAO;
import Model.Product;
import Model.Basket;
import Model.Order;
import sun.misc.Resource;

import java.sql.*;
import java.text.ParseException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;


public class CustomerDAOImpl implements CustomerDAO {
    private final DateFormat FORMAT = new SimpleDateFormat("yyyy-mm-dd");
    private List<Product> allProducts;
    private List<Order> myOrders;


    public List<Product> getAllProducts() throws SQLException {
        allProducts = new ArrayList<>();
        try {
            Class.forName("org.sqlite.JDBC");
            Connection connection = DriverManager.getConnection("jdbc:sqlite:alcoshop.db");
            Statement stmt = connection.createStatement();
            connection.setAutoCommit(false);

            ResultSet resultSet = stmt.executeQuery("SELECT * FROM Products;");

            while (resultSet.next()){
                int id = resultSet.getInt("ID");
                String name = resultSet.getString("Name");
                int typeID = resultSet.getInt("TypeID");
                float price = resultSet.getFloat("Price");
                float alcoholContent = resultSet.getFloat("Vol.(%)");
                float volume = resultSet.getFloat("Vol(l)");
                int amount = resultSet.getInt("Amount");
                java.util.Date expDate = FORMAT.parse(resultSet.getString("ExpDate"));
                java.sql.Date sqlExpDate = new java.sql.Date(expDate.getTime());
                Product product = new Product(id, name, typeID, price, alcoholContent,
                        volume, amount, sqlExpDate);

                allProducts.add(product);
            }
            resultSet.close();
            stmt.close();
            connection.commit();
            connection.close();
        } catch (ParseException | ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        }
        return allProducts;
    }

    public Basket getBasket(int orderID){
        return null;
    }





    private Connection setConnection() {
        Connection connection = null;
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:alcoshop.db");
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return connection;
    }


    public List<Order> getOrders(int customerId) throws SQLException{
        myOrders = new ArrayList<>();
        Connection con = setConnection();
        PreparedStatement stmt = null;
        ResultSet resultSet = null;

        try {
            stmt = con.prepareStatement("SELECT * FROM Orders WHERE CustomerId = ?");
            con.setAutoCommit(false);
            stmt.setInt(1, customerId);
            resultSet = stmt.executeQuery();

            int orderID = resultSet.getInt("ID");
            int basketID = resultSet.getInt("basketID");
            int userID = resultSet.getInt("userID");
            myOrders.add(new Order(orderID, basketID, userID));

            con.commit();
            con.close();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());

        return myOrders;
    }

    public Order getOrder(int orderId) throws SQLException{
        Connection conn = setConnection();
        PreparedStatement statm = null;
        ResultSet resSet = null;
        Order order = null;

        try {
            statm = con.prepareStatement("SELECT * FROM Orders WHERE orderId = ?");
            conn.setAutoCommit(false);
            statm.setInt(1, orderId);
            resSet = stmt.executeQuery();

            //create Order Object
            int orderID = resSet.getInt("ID");
            int basketID = resSet.getInt("basketID");
            int userID = resSet.getInt("userID");
            order = new Order(orderID, basketID, userID);

            //close connection
            conn.commit();
            conn.close();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return order;
    }

    public Product getProductById(int productID){
        Product product = null;
        Connection connection = setConnection();
        ResultSet resultSet2 = null;

        try {
            //creating connection
            connection.setAutoCommit(false);

            //create statement
            PreparedStatement statement = connection.prepareStatement("SELECT name FROM Products WHERE id=?")

            // set statement
            statement.setInt(1, productID);

            //execute query
            resultSet2 = statement.executeQuery();

            //create result product from query result
            int id = resultSet.getInt("ID");
            String name = resultSet.getString("Name");
            int typeID = resultSet.getInt("TypeID");
            float price = resultSet.getFloat("Price");
            float alcoholContent = resultSet.getFloat("Vol.(%)");
            float volume = resultSet.getFloat("Vol(l)");
            int amount = resultSet.getInt("Amount");
            java.util.Date expDate = FORMAT.parse(resultSet.getString("ExpDate"));
            java.sql.Date sqlExpDate = new java.sql.Date(expDate.getTime());
            product = new Product(id, name, typeID, price, alcoholContent,
                    volume, amount, sqlExpDate);


            //close statement and connection
            resultSet.close();
            statement.close();
            connection.close();

        }catch (Exception exception){
            System.err.println(exception);
            System.exit(0);
        }
        return product;

    }

    public Order makeNewOrder(int ID, int basketID, int userID){
            Order newOrder = null;

        }


}