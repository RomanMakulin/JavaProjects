package org.example.Controller.sql;

import org.example.Model.DB.DataBaseHandler;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class updateAnimalCommand extends DataBaseHandler {
    public void update(int id){
        String oldCommand = "";

        try {
            String readCommand = "SELECT " +
                    "`command` " +
                    "FROM newhumanfriend " +
                    "WHERE id = " + id + ";";

            Statement statement = getDbConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(readCommand);

            while (resultSet.next()){
                oldCommand = resultSet.getString(1);
            }

            String[] command = new Scanner(System.in).nextLine().split(",");
            for (int i = 0; i < command.length; i++) {
                oldCommand = oldCommand + " " + command[i];
            }

            String task = "UPDATE newhumanfriend " +
                    "SET `command` = '" + oldCommand +"' " +
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
