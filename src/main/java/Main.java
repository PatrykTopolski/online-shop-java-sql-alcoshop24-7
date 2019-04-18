import Model.Product;
import Controller.Controller;


import java.sql.SQLException;

public class Main{
    public static void main(String[] args) throws SQLException{
        Controller mainController = new Controller();
        mainController.handleShop();


    }
}