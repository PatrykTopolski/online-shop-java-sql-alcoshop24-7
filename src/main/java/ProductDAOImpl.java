import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ProductDAOImpl implements ProductDAO {
    private List<Product> allProducts;
    private final DateFormat FORMAT = new SimpleDateFormat("MMMM d, yyyy");

    @Override
    public List<Product> getAllProducts() throws SQLException {
        allProducts = new ArrayList<>();
        try {
            Class.forName("org.sqlite.JDBC");
            Connection connection = DriverManager.getConnection("jdbc:sqlite:alcoshop.db");
            Statement stmt = connection.createStatement();
            connection.setAutoCommit(false);

            ResultSet resultSet = stmt.executeQuery( "SELECT * FROM Products;" );

            while (resultSet.next()){
                int id = resultSet.getInt("ID");
                int typeID = resultSet.getInt("TypeID");
                float price = resultSet.getFloat("Price");
                float alcoholContent = resultSet.getFloat("Vol.(%)");
                float volume = resultSet.getFloat("Vol(l)");
                int amount = resultSet.getInt("Amount");
                Date expDate = (Date) FORMAT.parse(resultSet.getString("ExpDate"));

                Product product = new Product(id, typeID, price, alcoholContent,
                volume, amount, expDate);
                
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
}