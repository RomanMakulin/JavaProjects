package org.example.View;

import org.example.Model.Interfaces.UserService;
import org.example.Model.Pharmacy;

import java.util.List;

public class ViewMedicine implements UserService {
    @Override
    public void service(List<Pharmacy> pharmacyList, int i) {
        for (int k = 0; k < pharmacyList.get(i).getMedicinesList().size(); k++) {
            System.out.println("ID: " + k + " " + pharmacyList.get(i).getMedicinesList().get(k));
        }
    }
}
