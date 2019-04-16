package Model;

public class Employee extends User {

    public Employee(int id, int userTypeId, String name, String login, String password) {
        super(id, userTypeId, name, login, password);
    }

    @Override
    public void displayMenu() {

    }
}
