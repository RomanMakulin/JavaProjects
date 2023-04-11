package org.example.Controller;

import org.example.Controller.Administrator.UserService;
import org.example.Model.Pharmacy;
import org.example.Model.SimpleUser;
import org.example.View.InputLogin;
import org.example.View.InputPassword;

import java.util.List;

public class Registration implements UserService {
    @Override
    public void service(List<Pharmacy> pharmacyList, int i) {
        pharmacyList.get(i).getUserList().add(new SimpleUser(new InputLogin().input(), new InputPassword().input()));
    }
}
