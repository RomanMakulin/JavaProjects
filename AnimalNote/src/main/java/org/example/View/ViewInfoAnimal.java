package org.example.View;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ViewInfoAnimal {
    public void info(ResultSet resultSet) throws SQLException {
        System.out.println("id: " + resultSet.getString(1) +
                "; name: " + resultSet.getString(2) +
                "; commands: " + resultSet.getString(3) +
                "; date birthday: " + resultSet.getString(4) +
                "; type: " + resultSet.getString(5));
    }
}
