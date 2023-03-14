package org.example;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

import static org.example.CityFromFile.parse;

public class Main {
    public static void main(String[] args) throws IOException {
        List<City> cities = parse();


        sortListNameCity(cities);
        print(cities);

        sortListDistrictAndNameCity(cities);
        print(cities);
    }

    public static void print(List<City> cities){
        for (City city: cities) {
            System.out.println(city);
        }
    }

    private static void sortListNameCity(List<City> cities) {
        cities.sort((name1, name2) -> name1.getName().compareToIgnoreCase(name2.getName()));
    }

    private static void sortListDistrictAndNameCity(List<City> cities) {
        cities.sort(Comparator.comparing(City::getDistrict).thenComparing(City::getName));
    }

}