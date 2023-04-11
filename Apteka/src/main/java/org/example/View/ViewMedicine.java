package org.example.View;

import org.example.Model.Pharmacy;

import java.util.List;

public class ViewMedicine {
    public void show(List<Pharmacy> pharmacyList, int i) {
        for (int k = 0; k < pharmacyList.get(i).getMedicinesList().size(); k++) {
            System.out.println("ID: " + k + " " + pharmacyList.get(i).getMedicinesList().get(k));
        }
    }
}
