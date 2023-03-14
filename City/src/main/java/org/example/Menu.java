package org.example;

import java.util.Comparator;
import java.util.List;

public class Menu {

    public void print(List<City> cities){
        for (City city: cities) {
            System.out.println(city);
        }
    }

    public void sortListNameCity(List<City> cities) {
        cities.sort((name1, name2) -> name1.getName().compareToIgnoreCase(name2.getName()));
    }

    public void sortListDistrictAndNameCity(List<City> cities) {
        cities.sort(Comparator.comparing(City::getDistrict).thenComparing(City::getName));
    }
}
