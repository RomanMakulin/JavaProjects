package org.example.Controller.Login;

import org.example.Model.Pharmacy;
import java.util.List;

public class CheckLoginPassword{

    public boolean check(List<Pharmacy> pharmacyList, int i, int j, String login, int password){
        return login.equals(pharmacyList.get(i).getUserList().get(j).getName())
                && password == pharmacyList.get(i).getUserList().get(j).getPassword();
    }
}
