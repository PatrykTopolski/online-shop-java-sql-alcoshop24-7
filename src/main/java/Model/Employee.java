package Model;

public class Employee extends User {

    public Employee(int id, int userTypeId, String login, String password) {
        super(id, userTypeId, login, password);
    }

    @Override
    public void displayMenu() {

    }
}
