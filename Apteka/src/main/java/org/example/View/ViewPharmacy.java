package org.example.View;

import org.example.Model.Pharmacy;

import java.util.List;

public class ViewPharmacy {
    public void show(List<Pharmacy> pharmacyList){
        for (int i = 0; i < pharmacyList.size(); i++) {
            System.out.println(pharmacyList.get(i).getName());
        }
    }
}
