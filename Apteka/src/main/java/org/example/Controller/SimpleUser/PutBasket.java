package org.example.Controller.SimpleUser;

import org.example.Controller.Administrator.UserService;
import org.example.Model.Pharmacy;
import org.example.View.*;

import java.util.List;

public class PutBasket{
    public void service(List<Pharmacy> pharmacyList, int i, int j) {

        switch (new ViewSimpleUserMenu().menu()){
            case "1":
                new ViewMedicine().show(pharmacyList, i);
                pharmacyList.get(i).getUserList().get(j).getBasket().put(pharmacyList.get(i).getMedicinesList());
                pharmacyList.get(i).getUserList().get(j).getBasket().del(pharmacyList.get(i).getMedicinesList());
                break;
            case "2":
                pharmacyList.get(i).getUserList().get(j).getBasket().show();
//                new ViewBasket().show(pharmacyList, i, j);
                break;
            case "3":
                System.exit(1);

        }

    }
}
