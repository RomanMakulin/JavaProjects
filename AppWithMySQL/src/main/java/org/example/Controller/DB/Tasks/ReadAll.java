package org.example.Controller.DB.Tasks;

import org.example.Model.DB.DataBaseHandler;
import org.example.Model.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ReadAll extends DataBaseHandler {
    public List<User> readUsers() {
        List<User> userList = new ArrayList<>();
        try {
            String readNames = "SELECT " +
                    "u.id, " +
                    "u.first_name, " +
                    "u.last_name, " +
                    "u.age, " +
                    "g.group_name, " +
                    "p.payment_status, " +
                    "u.near_date " +
                    "FROM users u " +
                    "JOIN user_group g ON u.id_group = g.id " +
                    "JOIN payment p ON u.id_payment = p.id " +
                    "ORDER BY u.id";

            Statement statement = getDbConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(readNames);

            while (resultSet.next()) {

                userList.add(new User(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getInt(4),
                        resultSet.getString(5),
                        resultSet.getString(6),
                        resultSet.getDate(7)
                ));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return userList;
    }
}
