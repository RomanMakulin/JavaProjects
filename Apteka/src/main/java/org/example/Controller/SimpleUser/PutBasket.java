package org.example.Controller.SimpleUser;

import org.example.Model.Pharmacy;
import org.example.View.ViewMedicine;

import java.util.List;

public class PutBasket {
    public void put(List<Pharmacy> pharmacyList, int i, int j){
        new ViewMedicine().service(pharmacyList, i);
        pharmacyList.get(i).getUserList().get(j).getBasket().put(pharmacyList.get(i).getMedicinesList(), pharmacyList, i ,j);
    }
}
