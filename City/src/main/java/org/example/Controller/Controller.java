package org.example.Controller;

import org.example.Controller.FileWork.CityFromFile;
import org.example.Controller.Menu.MaxPopulationCity;
import org.example.Controller.Menu.RegionsCount;
import org.example.Controller.Menu.SortingDistrictAndName;
import org.example.Controller.Menu.SortingName;
import org.example.Model.City;
import org.example.View.Input;
import org.example.View.ShowMenu;

import java.util.List;

public class Controller {

    public void start() {
        List<City> cities = new CityFromFile().loadFile();
        boolean cmd = true;

        while (cmd) {
            new ShowMenu().menu();
            switch (new Input().input()) {

                case "1":
                    new MaxPopulationCity().action(cities);
                    break;

                case "2":
                    new RegionsCount().action(cities);
                    break;

                case "3":
                    new SortingDistrictAndName().action(cities);
                    break;

                case "4":
                    new SortingName().action(cities);
                    break;

                case "5":
                    cmd = false;
                    System.out.println("Cia");
                    break;
            }
        }

    }

}
