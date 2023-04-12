package org.example.Controller;

import org.example.Controller.Cards.CardsFromFile;
import org.example.Controller.Cards.Parse;
import org.example.Controller.Login.ChoicePharmacy;
import org.example.Controller.MedicinesContent.ForBeHealth;
import org.example.Controller.MedicinesContent.ForHealthPlus;
import org.example.Model.Card;
import org.example.Model.Pharmacy;
import org.example.Model.SimpleUser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    public void buttonClick() {

        // Список аптек
        List<Pharmacy> pharmacyList = new ArrayList<>();
        pharmacyList.add(0, new Pharmacy("Be Health", "on", new ForBeHealth().generateList()));
        pharmacyList.add(1, new Pharmacy("Health plus", "on", new ForHealthPlus().generateList()));

        pharmacyList.get(0).getUserList().add(new SimpleUser("sky",123));

        // card list
        List<Card> cardList = new CardsFromFile().generate();

        // назначение администраторов в каждую аптеку
        new AddAdministrator().create(pharmacyList);

        // вход или регистрация для конкретной аптеки
        new ChoicePharmacy().log(pharmacyList);

    }
}

