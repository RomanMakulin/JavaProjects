package org.example.Controller;

import org.example.Controller.Login.ChoicePharmacy;
import org.example.Controller.MedicinesContent.ForBeHealth;
import org.example.Controller.MedicinesContent.ForHealthPlus;
import org.example.Model.Medicines;
import org.example.Model.Pharmacy;
import org.example.Model.SimpleUser;

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

        pharmacyList.get(0).getUserList().add(new SimpleUser("sky",123));

        // назначение администраторов в каждую аптеку
        new AddAdministrator().create(pharmacyList);

        // вход или регистрация для конкретной аптеки
        new ChoicePharmacy().log(pharmacyList);

    }
}

