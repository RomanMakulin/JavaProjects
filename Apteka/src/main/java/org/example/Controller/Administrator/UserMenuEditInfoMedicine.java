package org.example.Controller.Administrator;

import org.example.Controller.Administrator.Actions.SetCountMedicine;
import org.example.Controller.Administrator.Actions.SetNameMedicine;
import org.example.Controller.Administrator.Actions.SetPriceMedicine;
import org.example.Model.Interfaces.UserService;
import org.example.Model.Pharmacy;
import org.example.View.Menu.ViewAdmEditMenu;
import org.example.View.Menu.ViewAdmMainMenu;
import org.example.View.ViewMedicine;
import org.example.View.WrongCmd;
import java.util.List;
import java.util.Scanner;

public class UserMenuEditInfoMedicine implements UserService {
    @Override
    public void service(List<Pharmacy> pharmacyList, int i){
        new ViewMedicine().service(pharmacyList, i);
        new ViewAdmEditMenu().show();
        switch (new Scanner(System.in).nextLine()){
            case "1":
                new SetPriceMedicine().service(pharmacyList, i);
                break;
            case "2":
                new SetCountMedicine().service(pharmacyList, i);
                break;
            case "3":
                new SetNameMedicine().service(pharmacyList, i);
                break;
            case "4":
                new UserMenuMain().service(pharmacyList, i);
                break;
            default:
                new WrongCmd().show();
                break;
        }
    }
}
