package org.example.db.Controller.DB.Tasks;

import org.example.db.Controller.DB.DataBaseHandler;
import org.example.db.Model.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class ReadAllUsers extends DataBaseHandler {
    public void readUsers(List<User> userList) {

        try {
            String readNames = "SELECT id, first_name, last_name, age, id_group, id_payment FROM users";
            Statement statement = getDbConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(readNames);

            while (resultSet.next()){

                userList.add(new User(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getInt(4),
                        resultSet.getInt(5),
                        resultSet.getInt(6)
                ));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
