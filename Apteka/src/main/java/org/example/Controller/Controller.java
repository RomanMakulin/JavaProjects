package org.example.Controller;

import org.example.Controller.Login.LoginMenu;
import org.example.Controller.MedicinesContent.ForBeHealth;
import org.example.Controller.MedicinesContent.ForHealthPlus;
import org.example.Model.Medicines;
import org.example.Model.Pharmacy;
import org.example.View.SwitchPharmacy;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    public void buttonClick() {

        // Набор лекарств для первой аптеки
        List<Medicines> beHealth = new ForBeHealth().generateList();

        // Набор лекарств для второй аптеки
        List<Medicines> healthPlus = new ForHealthPlus().generateList();

        // Список аптек
        List<Pharmacy> pharmacyList = new ArrayList<>();
        pharmacyList.add(new Pharmacy("Be Health", "on", beHealth));
        pharmacyList.add(new Pharmacy("Health plus", "on", healthPlus));

        // назначение администраторов в каждую аптеку
        new AddAdministrator().create(pharmacyList);

        // вход или регистрация для конкретной аптеки
        while (true) {
            String find = new SwitchPharmacy().input(pharmacyList);
            for (int i = 0; i < pharmacyList.size(); i++) {
                if (pharmacyList.get(i).getName().equals(find)) new LoginMenu().service(pharmacyList, i);
            }
        }

    }


}

