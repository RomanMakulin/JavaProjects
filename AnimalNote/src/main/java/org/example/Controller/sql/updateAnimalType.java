package org.example.Controller.sql;

import org.example.Model.DB.DataBaseHandler;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class updateAnimalType extends DataBaseHandler {
    public void update(int id, String type) {
        String sql = "UPDATE newhumanfriend " +
                "SET `oldTable` = '" + type + "' " +
                "WHERE `id` = " + id + ";";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(sql);
            prSt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
