package org.example.Controller.Administrator;

import org.example.Model.Pharmacy;
import org.example.View.ViewAdmMenu;
import org.example.View.ViewMedicine;
import org.example.View.WrongCmd;
import java.util.List;
import java.util.Scanner;

public class UserMenuEditInfoMedicine implements UserService {
    @Override
    public void service(List<Pharmacy> pharmacyList, int i){
        new ViewMedicine().show(pharmacyList, i);
        new ViewAdmMenu().editInfoMedicine();
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
            default:
                new WrongCmd().error();
                break;
        }
    }
}
