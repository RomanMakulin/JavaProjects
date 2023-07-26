package org.example.Controller.sql;

import org.example.Model.DB.DataBaseHandler;
import org.example.View.showCommands;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class getCommand extends DataBaseHandler {
    public void get(int id) {

        try {
            String readCommand = "SELECT " +
                    "`command` " +
                    "FROM newhumanfriend " +
                    "WHERE id = " + id + ";";

            Statement statement = getDbConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(readCommand);

            while (resultSet.next()) {
                String[] commands = resultSet.getString(1).split(" ");
                new showCommands().commandList(commands);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
