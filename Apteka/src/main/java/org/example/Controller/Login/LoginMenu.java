package org.example.Controller.Login;

import org.example.Controller.Administrator.UserService;
import org.example.Controller.Registration;
import org.example.Model.Pharmacy;
import org.example.View.SwitchLoginRegistration;
import org.example.View.WrongCmd;

import java.util.List;

public class LoginMenu implements UserService {
    @Override
    public void service(List<Pharmacy> pharmacyList, int i) {
        switch (new SwitchLoginRegistration().input()) {
            case "1":
                new LogicLogin().service(pharmacyList, i);
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
