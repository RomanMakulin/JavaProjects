package org.example;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

import static org.example.CityFromFile.parse;

public class Main {
    public static void main(String[] args) {

        List<City> cities = parse();
        Menu menu = new Menu();

        menu.sortListNameCity(cities);
        menu.print(cities);

        menu.sortListDistrictAndNameCity(cities);
        menu.print(cities);

    }
}