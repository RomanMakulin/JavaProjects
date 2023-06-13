package org.example.db.Controller.DB.Tasks;

import org.example.db.Controller.DB.Const;
import org.example.db.Controller.DB.DataBaseHandler;
import org.example.db.Model.User;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SignUpUser extends DataBaseHandler{
    public void signUpUser(User user) {
        String insert = "INSERT INTO " + Const.USER_TABLE + "(" +
                Const.USERS_FIRST_NAME + "," +
                Const.USERS_LAST_NAME + "," +
                Const.USERS_AGE + "," +
                Const.USERS_ID_GROUP + "," +
                Const.USERS_ID_PAYMENT + ")" +
                "VALUES (?,?,?,?,?)";

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, user.getFirst_name());
            prSt.setString(2, user.getLast_name());
            prSt.setInt(3, user.getAge());
            prSt.setInt(4, user.getId_group());
            prSt.setInt(5, user.getId_payment());
            prSt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
