package org.example;

import java.io.IOException;
import java.util.*;

import static org.example.CityFromFile.parse;

public class Main {
    public static void main(String[] args) throws IOException {
        List<City> cities = parse();
        print(cities);
    }

    public static void print(List<City> cities){
        for (City city: cities) {
            System.out.println(city);
        }
    }

}