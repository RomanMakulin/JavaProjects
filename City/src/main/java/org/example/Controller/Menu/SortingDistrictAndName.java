package org.example.Controller.Menu;

import org.example.Model.City;
import org.example.View.ViewCity;

import java.util.Comparator;
import java.util.List;

public class SortingDistrictAndName implements Menu {
    @Override
    public void action(List<City> cities) {
        cities.sort(Comparator.comparing(City::getDistrict).thenComparing(City::getName));
        new ViewCity().action(cities);
    }
}
