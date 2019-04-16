import java.sql.SQLException;

public class Controller {

    public void handleShop() throws SQLException{
        AdminController admin = new AdminController();
        admin.getAllProducts();
    }
}
