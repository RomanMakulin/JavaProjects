package org.example.Controller.DB.Tasks;

import org.example.Model.DB.DataBaseHandler;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update extends DataBaseHandler {
    public void updateUser(int id, int value) {

        try {
            String readNames = "UPDATE users SET id_group = " + value + " where id = " + id;
            PreparedStatement prSt = getDbConnection().prepareStatement(readNames);
            prSt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
