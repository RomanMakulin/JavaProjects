package org.example.Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CommandsConvertorApp {
    public String convertString(ResultSet resultSet) throws SQLException {
        String oldCommand = "";
        while (resultSet.next()){
            oldCommand = resultSet.getString(1);
        }

        String[] command = new Scanner(System.in).nextLine().split(",");
        for (int i = 0; i < command.length; i++) {
            oldCommand = oldCommand + " " + command[i];
        }
        return oldCommand;
    }
}
