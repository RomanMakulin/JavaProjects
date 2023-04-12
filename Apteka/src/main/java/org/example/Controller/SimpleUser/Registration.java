package org.example.Controller.SimpleUser;

import org.example.Model.Interfaces.UserService;
import org.example.Model.Pharmacy;
import org.example.Model.SimpleUser;
import org.example.View.Input.InputLogin;
import org.example.View.Input.InputPassword;

import java.util.List;

public class Registration implements UserService {
    @Override
    public void service(List<Pharmacy> pharmacyList, int i) {
        pharmacyList.get(i).getUserList().add(new SimpleUser(new InputLogin().input(), new InputPassword().input()));
    }
}
