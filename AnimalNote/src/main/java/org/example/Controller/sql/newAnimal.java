package org.example.Controller.sql;

import org.example.Controller.CommandsConvertorDB;
import org.example.Model.Animal;
import org.example.Model.Counter;
import org.example.Model.DB.DataBaseHandler;
import org.example.View.CountAdd;

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
            prSt.setString(2, new CommandsConvertorDB().convertString(animal));
            prSt.setString(3, animal.getBith());
            prSt.setString(4, animal.getOldTable());
            prSt.executeUpdate();

            Counter counter = new Counter();
            counter.add();
            new CountAdd().show(counter);

        } catch (SQLException e) {
            throw new RuntimeException("Ошибка записи в Базу данных: " + e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

