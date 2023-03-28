package org.example.View;

import org.example.Controller.Menu.Menu;
import org.example.Model.City;

import java.util.List;

public class ViewCity implements Menu {
    @Override
    public void action(List<City> cities) {
        for (City city : cities) {
            System.out.println(city);
        }
    }
}
