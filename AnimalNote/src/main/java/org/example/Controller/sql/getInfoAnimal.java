package org.example.Controller.sql;

import org.example.Model.DB.DataBaseHandler;
import org.example.View.ViewInfoAnimal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class getInfoAnimal extends DataBaseHandler {
    public void info(int id){
        try {
            String readCommand = "SELECT " +
                    "* " +
                    "FROM newhumanfriend " +
                    "WHERE id = " + id + ";";

            Statement statement = getDbConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(readCommand);

            while (resultSet.next()) {
                new ViewInfoAnimal().info(resultSet);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
