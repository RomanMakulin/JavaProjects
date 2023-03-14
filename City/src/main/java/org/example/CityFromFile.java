package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CityFromFile {

    public void sortingNameCity(){

    }

    public static List<City> parse() {
        List<City> cities = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(
                    "D:\\Road to developer\\IT_WorkPlace\\OriginWorkPlace\\JavaProjects\\City\\src\\main\\java\\org\\example\\sber_city.csv"));

            while (scanner.hasNextLine()) {
                cities.add(parse(scanner.nextLine()));
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        return cities;
    }

    private static City parse(String line) {
        Scanner scanner = new Scanner(line);
        String[] values = scanner.nextLine().split(";", 6);
        scanner.close();
        return new City(Integer.parseInt(values[0]), values[1], values[2], values[3], Integer.parseInt(values[4]), values[5]);
    }
}
