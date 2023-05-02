package org.example.View;

import org.example.Model.Interfaces.UserService;
import org.example.Model.Pharmacy;

import java.util.List;

public class ShowUsers implements UserService {
    @Override
    public void service(Pharmacy pharmacy){
        for (int j = 0; j < pharmacy.getUserList().size(); j++) {
            System.out.println(pharmacy.getUserList().get(j).getName());
        }
    }
}
