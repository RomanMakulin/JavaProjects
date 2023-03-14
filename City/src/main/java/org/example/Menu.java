package org.example;

import java.util.Arrays;
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
        print(cities);
    }

    public void sortListDistrictAndNameCity(List<City> cities) {
        cities.sort(Comparator.comparing(City::getDistrict).thenComparing(City::getName));
        print(cities);
    }
    public void maxPopulationCity(List<City> cities){
        City [] city = cities.toArray(new City[0]);
        int max = 0;
        int index = 0;
        for (int i = 0; i < city.length; i++) {
            if (city[i].getPopulation() > max){
                max = city[i].getPopulation();
                index = i;
            }
        }
        System.out.printf("[%d] = %d", index, max);
    }
}
