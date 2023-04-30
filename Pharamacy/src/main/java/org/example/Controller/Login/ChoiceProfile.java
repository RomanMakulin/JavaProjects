package org.example.Controller.Login;

import org.example.Controller.Administrator.UserMenuMain;
import org.example.Controller.SimpleUser.MenuActions;
import org.example.Model.Card;
import org.example.Model.Pharmacy;
import org.example.View.Input.InputLogin;
import org.example.View.Input.InputPassword;
import org.example.View.NotFoundUser;

import java.util.List;

public class ChoiceProfile {
    public void service(List<Pharmacy> pharmacyList, int i, boolean loginMenu, List<Card> cardList) {

        String login = new InputLogin().input();
        int password = new InputPassword().input();

        for (int j = 0; j < pharmacyList.get(i).getUserList().size(); j++) {
            if (new CheckLoginPassword().check(pharmacyList, i, j, login, password)) {
                loginMenu = false;
                boolean profileMenu = true;

                while (profileMenu) {
                    // adm profile
                    if (new CheckAdmStatus().check(pharmacyList, i, j)) new UserMenuMain().service(pharmacyList, i);
                        // simple user profile
                    else new MenuActions().service(pharmacyList, i, j, cardList);
                }

            }else new NotFoundUser().show();
        }
    }
}
