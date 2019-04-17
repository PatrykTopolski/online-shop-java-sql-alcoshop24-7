package Model;

public class Customer extends User {


    public Customer(int id, int userTypeId,  String login, String password) {
        super(id, userTypeId, login, password);
    }

    @Override
    public void displayMenu() {

    }
}
