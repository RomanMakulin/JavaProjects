package org.example.Controller.Login;

import org.example.Controller.Administrator.MenuMain;
import org.example.Controller.SimpleUser.MenuActions;
import org.example.Model.Administrator;
import org.example.Model.Card;
import org.example.Model.Pharmacy;
import org.example.View.Input.InputLogin;
import org.example.View.Input.InputPassword;
import java.util.List;

public class ChoiceProfile {
    public void service(Pharmacy pharmacy, List<Card> cardList) {

        String login = new InputLogin().input();
        int password = new InputPassword().input();

        for (int j = 0; j < pharmacy.getUserList().size(); j++) {
            if (login.equals(pharmacy.getUserList().get(j).getName())
                    && password == pharmacy.getUserList().get(j).getPassword()) {

                while (true) {
                    // adm profile
                    if (pharmacy.getUserList().get(j) instanceof Administrator) new MenuMain().service(pharmacy);
                        // simple user profile
                    else new MenuActions().service(pharmacy, pharmacy.getUserList().get(j), cardList);
                }

            }
        }
    }
}
