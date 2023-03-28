package org.example.Controller.Menu;

import org.example.Model.City;
import org.example.View.ViewCity;

import java.util.List;

public class SortingName implements Menu {
    @Override
    public void action(List<City> cities) {
        cities.sort((name1, name2) -> name1.getName().compareToIgnoreCase(name2.getName()));
        new ViewCity().action(cities);
    }
}
