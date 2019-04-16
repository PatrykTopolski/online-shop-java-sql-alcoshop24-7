import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        ProductDAOImpl dao = new ProductDAOImpl();
        List<Product> allProducts;
        try {
            allProducts = new ArrayList<>(dao.getAllProducts());
            for(Product product : allProducts){
                System.out.println(product.getId());
                System.out.println(product.getPrice());
                System.out.println(product.getExpirationDate());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}