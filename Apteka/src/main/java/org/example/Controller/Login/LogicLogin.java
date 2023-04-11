package org.example.Controller.Login;

import org.example.Controller.Administrator.UserMenuMain;
import org.example.Controller.Administrator.UserService;
import org.example.Controller.SimpleUser.PutBasket;
import org.example.Model.Pharmacy;

import java.util.List;

public class LogicLogin implements UserService {
    @Override
    public void service(List<Pharmacy> pharmacyList, int i) {
        for (int j = 0; j < pharmacyList.get(i).getUserList().size(); j++) {
            if (new CheckLoginPassword().check(pharmacyList, i, j)) {
                // adm profile
                if (new CheckAdmStatus().check(pharmacyList, i, j)) new UserMenuMain().service(pharmacyList, i);
                    // simple user profile
                else new PutBasket().service(pharmacyList, i);
            }
        }
    }
}
