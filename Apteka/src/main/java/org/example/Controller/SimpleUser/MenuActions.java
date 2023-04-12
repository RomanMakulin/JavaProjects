package org.example.Controller.SimpleUser;

import org.example.Model.Pharmacy;
import org.example.View.*;
import org.example.View.Menu.ViewSimpleUserMenu;

import java.util.List;

public class MenuActions {
    public void service(List<Pharmacy> pharmacyList, int i, int j) {

        switch (new ViewSimpleUserMenu().input()){
            case "1":
                new PutBasket().put(pharmacyList, i , j);
                break;
            case "2":
                new ViewBasket().show(pharmacyList, i, j);
                break;
            case "3":
                new ShowMoney().show(pharmacyList, i ,j);
                break;
            case "4":
                // прикрепить карту
                break;
            case "5":
                new SystemExit().show();

        }

    }
}
