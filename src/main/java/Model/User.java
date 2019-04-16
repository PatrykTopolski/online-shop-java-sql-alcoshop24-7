package Model;

public abstract class User {
    private int id;
    private int userTypeId;
    private String name;
    private String login;
    private String password;

    public User(int id, int userTypeId, String name, String login, String password) {
        this.id = id;
        this.userTypeId = userTypeId;
        this.name = name;
        this.login = login;
        this.password = password;
    }

    public abstract void displayMenu();

    public int getId() {
        return id;
    }

    public int getUserTypeId() {
        return userTypeId;
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
