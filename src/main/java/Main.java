import java.sql.SQLException;
import Controller.Controller;

public class Main{
    public static void main(String[] args) throws SQLException{
        Controller mainController = new Controller();
        mainController.handleShop();

    }
}