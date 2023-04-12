package org.example.Controller.SimpleUser;

import org.example.Controller.Cards.CardsFromFile;
import org.example.Model.Card;
import org.example.Model.Pharmacy;
import org.example.View.*;
import org.example.View.Input.InputIdCard;
import org.example.View.Input.InputNeedMoney;
import org.example.View.Input.InputPinCard;
import org.example.View.Menu.ViewSimpleUserMenu;

import java.util.List;
import java.util.Scanner;

public class MenuActions {
    public void service(List<Pharmacy> pharmacyList, int i, int j, List<Card> cardList) {
        switch (new ViewSimpleUserMenu().input()) {
            case "1":
                new PutBasket().put(pharmacyList, i, j);
                break;
            case "2":
                new ViewBasket().show(pharmacyList, i, j);
                break;
            case "3":
                new ShowMoney().show(pharmacyList, i, j);
                break;
            case "4":
                new IncreaseMoney().service(pharmacyList, i, cardList);
                break;
            case "5":
                new SystemExit().show();
        }
    }
}
