package org.example;


import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<City> cities = new ArrayList<>();
        ArrayList<String> q = new ArrayList<>();

        Scanner scanner = new Scanner(new File("C:\\Users\\WayWayz\\Work_Place\\JavaProjects\\JavaProjects\\City\\src\\main\\java\\org\\example\\sber_city.csv"));
        q.add(scanner.nextLine());
        while (scanner.hasNextLine()) {
            cities.add(parse(scanner.nextLine()));
        }
//        for (int i = 0; i < cities.size(); i++) {
//            System.out.println(cities.get(i));
//        }

        Map<String, List<String>> hm = new HashMap<String, List<String>>();
        hm.put("City", q);
        System.out.println(hm.get(0));

    }

    private static City parse(String line) {
        Scanner scanner = new Scanner(line);
        String[] values = scanner.nextLine().split(";", 6);
        scanner.close();
        return new City(Integer.parseInt(values[0]), values[1], values[2], values[3], Integer.parseInt(values[4]), values[5]);
    }
}