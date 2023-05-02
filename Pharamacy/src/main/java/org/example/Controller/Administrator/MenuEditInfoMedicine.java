package org.example.Controller.Administrator;

import org.example.Controller.Administrator.Actions.SetCountMedicine;
import org.example.Controller.Administrator.Actions.SetNameMedicine;
import org.example.Controller.Administrator.Actions.SetPriceMedicine;
import org.example.Model.Interfaces.UserService;
import org.example.Model.Pharmacy;
import org.example.View.Menu.ViewAdmEditMenu;
import org.example.View.ViewMedicine;
import org.example.View.WrongCmd;
import java.util.Scanner;

public class MenuEditInfoMedicine implements UserService {
    @Override
    public void service(Pharmacy pharmacy){
        new ViewMedicine().service(pharmacy);
        new ViewAdmEditMenu().show();
        switch (new Scanner(System.in).nextLine()){
            case "1":
                new SetPriceMedicine().service(pharmacy);
                break;
            case "2":
                new SetCountMedicine().service(pharmacy);
                break;
            case "3":
                new SetNameMedicine().service(pharmacy);
                break;
            case "4":
                new MenuMain().service(pharmacy);
                break;
            default:
                new WrongCmd().show();
                break;
        }
    }
}
