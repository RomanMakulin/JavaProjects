package org.example.Controller.DB.Tasks;

import org.example.Model.DB.DataBaseHandler;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete extends DataBaseHandler {
    public void deleteUser(int id) {

        try {
            String readNames = "DELETE FROM users where id = " + id;
            PreparedStatement prSt = getDbConnection().prepareStatement(readNames);
            prSt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
