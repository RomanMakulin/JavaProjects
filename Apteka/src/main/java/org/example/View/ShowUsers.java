package org.example.View;

import org.example.Model.Interfaces.UserService;
import org.example.Model.Pharmacy;

import java.util.List;

public class ShowUsers implements UserService {
    @Override
    public void service(List<Pharmacy> pharmacyList, int i){
        for (int j = 0; j < pharmacyList.get(i).getUserList().size(); j++) {
            System.out.println(pharmacyList.get(i).getUserList().get(j).getName());
        }
    }
}
