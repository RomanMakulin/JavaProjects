package org.example.Controller.SimpleUser;

import org.example.Controller.Cards.CardsFromFile;
import org.example.Model.Card;
import org.example.Model.Interfaces.UserService;
import org.example.Model.Pharmacy;
import org.example.View.Input.InputIdCard;
import org.example.View.Input.InputNeedMoney;
import org.example.View.Input.InputPinCard;
import org.example.View.NotEnoughMoney;

import java.util.List;

public class IncreaseMoney {
    public void service(List<Pharmacy> pharmacyList, int i, List<Card> cardList) {
        int id = new InputIdCard().input();
        int pin = new InputPinCard().input();

        for (int k = 0; k < cardList.size(); k++) {
            if (cardList.get(k).getID() == id && cardList.get(k).getPin() == pin) {

                int needMoney = new InputNeedMoney().input();
                int currentMoney = pharmacyList.get(i).getUserList().get(k).getMoney();

                if (cardList.get(k).getMoney() >= needMoney) {
                    pharmacyList.get(i).getUserList().get(k).setMoney(currentMoney + needMoney);
                    cardList.get(k).setMoney(cardList.get(k).getMoney() - needMoney);
                } else new NotEnoughMoney().show();
            }
        }
    }
}
