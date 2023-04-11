package org.example.Controller.Administrator;

import org.example.Controller.Administrator.Actions.AddMedicine;
import org.example.Controller.Administrator.Actions.RemoveMedicine;
import org.example.Model.Pharmacy;
import java.util.List;
import java.util.Scanner;
import org.example.View.ViewAdmMenu;

public class UserMenuMain implements UserService {
    @Override
    public void service(List<Pharmacy> pharmacyList, int i) {

        new ViewAdmMenu().main();
        switch (new Scanner(System.in).nextLine()) {
            case "1":
                new AddMedicine().service(pharmacyList, i);
                break;

            case "2":
                new UserMenuEditInfoMedicine().service(pharmacyList, i);
                break;

            case "3":
                new RemoveMedicine().service(pharmacyList, i);
                break;

        }
    }
}
