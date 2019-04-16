import Model.Product;

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

                System.out.print(product.getId() + " ");
                System.out.print(product.getName()+ " ");
                System.out.print(product.getPrice()+ "zł ");
                System.out.print(product.getAlcoholContent()+"% ");
                System.out.print(product.getExpirationDate());
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}