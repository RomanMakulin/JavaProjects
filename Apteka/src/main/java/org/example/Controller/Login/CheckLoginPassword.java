package org.example.Controller.Login;

import org.example.Model.Pharmacy;
import org.example.View.InputLogin;
import org.example.View.InputPassword;

import java.util.List;

public class CheckLoginPassword {
    public boolean check(List<Pharmacy> pharmacyList, int i, int j){
        return new InputLogin().input().equals(pharmacyList.get(i).getUserList().get(j).getName())
                && new InputPassword().input() == pharmacyList.get(i).getUserList().get(j).getPassword();
    }
}
