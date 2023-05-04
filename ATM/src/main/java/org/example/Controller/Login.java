package org.example.Controller;

import org.example.Model.ATM;
import org.example.Model.AtmStatus;
import org.example.Model.User;
import org.example.View.Input.InputAtmId;
import org.example.View.Input.InputCardNumber;
import org.example.View.Input.InputLogin;
import org.example.View.Input.InputPin;
import org.example.View.Print.LoginSystem;
import org.example.View.Print.NotWorkingAtm;
import org.example.View.Print.WrongInput;
import java.util.List;

public class Login {
    public void log (List<ATM> atmList, List<User> userList){
        ATM atm = atmList.get(new InputAtmId().input());
        User user = userList.get(new InputCardNumber().input());

        new LoginSystem().print();
        if (atm.getAtmStatus().equals(AtmStatus.ON)) {

            String login = new InputLogin().input();
            int password = new InputPin().input();

            if (user.getLogin().equals(login) && user.getPin() == password) new Menu().service(user, userList);
            else new WrongInput().print();

        } else new NotWorkingAtm().print();
    }
}
