package org.example.Controller.sql;

import org.example.Controller.CommandsConvertorApp;
import org.example.Model.DB.DataBaseHandler;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class updateAnimalCommand extends DataBaseHandler {
    public void update(int id) {
        try {
            String readCommand = "SELECT " +
                    "`command` " +
                    "FROM newhumanfriend " +
                    "WHERE id = " + id + ";";

            Statement statement = getDbConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(readCommand);

            String task = "UPDATE newhumanfriend " +
                    "SET `command` = '" + new CommandsConvertorApp().convertString(resultSet) + "' " +
                    "WHERE `id` = " + id + ";";

            PreparedStatement prSt = getDbConnection().prepareStatement(task);
            prSt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
