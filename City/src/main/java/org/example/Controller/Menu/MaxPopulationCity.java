package org.example.Controller.Menu;

import org.example.Model.City;

import java.util.List;

public class MaxPopulationCity implements Menu {
    @Override
    public void action(List<City> cities) {
        City[] city = cities.toArray(new City[0]);
        int max = 0;
        int index = 0;
        for (int i = 0; i < city.length; i++) {
            if (city[i].getPopulation() > max) {
                max = city[i].getPopulation();
                index = i;
            }
        }
        System.out.printf("[%d] = %d\n", index, max);
    }
}
