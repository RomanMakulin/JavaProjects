package org.example.Controller;

import org.example.Controller.FileWork.ReadCards.ReadCards;
import org.example.Controller.Login.ChoicePharmacy;
import org.example.Model.Card;
import org.example.Model.Pharmacy;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    public void buttonClick() {

        // Список аптек
        List<Pharmacy> pharmacyList = new ArrayList<>();
        pharmacyList.add(0, new Pharmacy("BeHealth"));
        pharmacyList.add(1, new Pharmacy("HealthPlus"));

        // card list
        List<Card> cardList = new ReadCards().generate("Cards/cards.txt");

        // назначение администраторов в каждую аптеку
        new AddAdministrator().create(pharmacyList);

        // вход или регистрация для конкретной аптеки
        new ChoicePharmacy().log(pharmacyList, cardList);
    }
}

