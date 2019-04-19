package Controller;

import java.sql.SQLException;
import java.util.List;
import Model.User;

public interface ControllerDao {
    int getUserType(String login, String password) throws SQLException;
}
