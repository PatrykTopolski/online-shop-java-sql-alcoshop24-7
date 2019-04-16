package Model;

public class Customer extends User {


    public Customer(int id, int userTypeId, String name, String login, String password) {
        super(id, userTypeId, name, login, password);
    }

    @Override
    public void displayMenu() {

    }
}
