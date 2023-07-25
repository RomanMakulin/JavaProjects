package org.example.Controller.sql;

import org.example.Model.Animal;
import org.example.Model.DB.DataBaseHandler;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class newAnimal extends DataBaseHandler {
    public void create(Animal animal) {
        String insert = "INSERT INTO newhumanfriend" + "(" +
                "name" + "," +
                "command" + "," +
                "bith" + "," +
                "oldTable" + ")" +
                "VALUES (?,?,?,?)";

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);

            prSt.setString(1, animal.getName());

            StringBuilder str = new StringBuilder();
            for (int i = 0; i < animal.getCommandsList().size(); i++) {
                str.append(animal.getCommandsList().get(i) + " ");
            }
            String commands = str.toString();

            prSt.setString(2, commands);
            prSt.setString(3, animal.getBith());
            prSt.setString(4, animal.getOldTable());
            prSt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

