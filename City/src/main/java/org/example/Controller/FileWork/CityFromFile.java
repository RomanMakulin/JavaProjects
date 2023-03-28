package org.example.Controller.FileWork;

import org.example.Model.City;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CityFromFile {

    public List<City> loadFile() {
        List<City> cities = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("sber_city.csv"));
            while (scanner.hasNextLine()) {
                cities.add(new Parse().parse(scanner.nextLine()));
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        return cities;
    }
}
