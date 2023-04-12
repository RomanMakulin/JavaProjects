package org.example.Controller.Login;

import org.example.Controller.SimpleUser.Registration;
import org.example.Model.Card;
import org.example.Model.Pharmacy;
import org.example.View.Menu.SwitchLoginRegistration;
import org.example.View.WrongCmd;

import java.util.List;

public class LoginMenu {
    public void service(List<Pharmacy> pharmacyList, int i, boolean pharmacy, List<Card> cardList) {

        pharmacy = false; // закрываем меню выбора аптеки
        boolean loginMenu = true;

        while (loginMenu) {
            switch (new SwitchLoginRegistration().input()) {
                case "1":
                    new ChoiceProfile().service(pharmacyList, i, loginMenu, cardList);
                    break;

                case "2":
                    new Registration().service(pharmacyList, i);
                    break;

                default:
                    new WrongCmd().show();
                    break;
            }
        }

    }
}
