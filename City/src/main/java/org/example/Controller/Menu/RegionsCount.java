package org.example.Controller.Menu;

import org.example.Model.City;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegionsCount implements Menu {
    @Override
    public void action(List<City> cities) {
        Map<String, Integer> newSort = new HashMap<>();
        for (City item : cities) {
            newSort.merge(item.getRegion(), 1, Integer::sum);
        }
        newSort.forEach((region, count) -> System.out.printf("%s: %d\n", region, count));
    }
}
