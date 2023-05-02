package org.example.Controller.Administrator;

import org.example.Controller.Administrator.Actions.AddMedicine;
import org.example.Controller.Administrator.Actions.RemoveMedicine;
import org.example.Controller.FileWork.UpdateFiles.SaveProducts;
import org.example.Model.Interfaces.UserService;
import org.example.Model.Pharmacy;
import java.util.Scanner;
import org.example.View.Menu.ViewAdmMainMenu;
import org.example.View.SystemExit;
import org.example.View.WrongCmd;

public class MenuMain implements UserService {
    @Override
    public void service(Pharmacy pharmacy) {

        new ViewAdmMainMenu().show();
        switch (new Scanner(System.in).nextLine()) {
            case "1":
                new AddMedicine().service(pharmacy);
                break;
            case "2":
                new MenuEditInfoMedicine().service(pharmacy);
                break;
            case "3":
                new RemoveMedicine().service(pharmacy);
                break;
            case "4":
                new SystemExit().show();
                break;
            default:
                new WrongCmd().show();
                break;
        }
        new SaveProducts().save(pharmacy);
    }
}
