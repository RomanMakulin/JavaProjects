package org.example.Controller.SimpleUser;

import org.example.Model.Card;
import org.example.Model.Pharmacy;
import org.example.Model.User;
import org.example.View.*;
import org.example.View.Menu.ViewSimpleUserMenu;
import java.util.List;

public class MenuActions {
    public void service(Pharmacy pharmacy, User user, List<Card> cardList) {
        switch (new ViewSimpleUserMenu().input()) {
            case "1":
                new PutBasket().put(pharmacy, user);
                break;
            case "2":
                new ViewBasket().show(user);
                break;
            case "3":
                new ShowMoney().show(user);
                break;
            case "4":
                new IncreaseMoney().service(user, cardList);
                break;
            case "5":
                new SystemExit().show();
            default:
                new WrongCmd().show();
                break;
        }
    }
}
