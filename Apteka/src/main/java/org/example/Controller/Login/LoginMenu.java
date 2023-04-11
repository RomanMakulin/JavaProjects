package org.example.Controller.Login;

import org.example.Controller.Administrator.UserService;
import org.example.Controller.SimpleUser.Registration;
import org.example.Model.Pharmacy;
import org.example.View.SwitchLoginRegistration;
import org.example.View.WrongCmd;
import java.util.List;

public class LoginMenu{
    public void service(List<Pharmacy> pharmacyList, int i, boolean pharmacy) {

        pharmacy = false; // закрываем меню выбора аптеки
        boolean loginMenu = true;

        while (loginMenu){
            switch (new SwitchLoginRegistration().input()) {
                case "1":
                    new ChoiceProfile().service(pharmacyList, i, loginMenu);
                    break;

                case "2":
                    new Registration().service(pharmacyList, i);
                    break;

                default:
                    new WrongCmd().error();
                    break;
            }
        }

    }
}
