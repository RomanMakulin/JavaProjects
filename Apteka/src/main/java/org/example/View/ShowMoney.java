package org.example.View;

import org.example.Model.Interfaces.ViewService;
import org.example.Model.Interfaces.ViewUsers;
import org.example.Model.Pharmacy;

import java.util.List;

public class ShowMoney implements ViewUsers {

    @Override
    public void show(List<Pharmacy> pharmacyList, int i, int j) {
        System.out.println("Доступные средства: " + pharmacyList.get(i).getUserList().get(j).getMoney());
    }
}
