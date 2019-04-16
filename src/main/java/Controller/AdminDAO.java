package Controller;

import java.sql.SQLException;
import java.util.List;

import Model.Product;

public interface AdminDAO {

    List<Product> getAllProducts() throws SQLException;


    // public Product getProduct(int id);

    // public void insertProduct(Product product);
    // public void updateProduct(Product product);
    // public void deleteProduct(Product product);
}