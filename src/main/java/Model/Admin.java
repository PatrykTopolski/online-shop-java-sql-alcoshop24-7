package Model;

public class Admin extends User {

    public Admin(int id, int userTypeId, String name, String login, String password) {
        super(id, userTypeId, name, login, password);
    }

    @Override
    public void displayMenu() {

    }
}
