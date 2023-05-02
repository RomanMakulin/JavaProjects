package org.example.View;

import org.example.Model.Interfaces.ViewService;
import org.example.Model.Interfaces.ViewUsers;
import org.example.Model.Pharmacy;
import org.example.Model.User;

import java.util.List;

public class ShowMoney implements ViewUsers {

    @Override
    public void show(User user) {
        System.out.println("Доступные средства: " + user.getMoney());
    }
}
