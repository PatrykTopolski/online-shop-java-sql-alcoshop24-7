import Model.Product;

import java.sql.SQLException;
import java.util.List;

public interface AdminDAO {

    List<Product> getAllProducts() throws SQLException;


    // public Model.Product getProduct(int id);

    // public void insertProduct(Model.Product product);
    // public void updateProduct(Model.Product product);
    // public void deleteProduct(Model.Product product);
}