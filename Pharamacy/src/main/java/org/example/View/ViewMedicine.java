package org.example.View;

import org.example.Model.Interfaces.UserService;
import org.example.Model.Pharmacy;

import java.util.List;

public class ViewMedicine implements UserService {
    @Override
    public void service(Pharmacy pharmacy) {
        for (int k = 0; k < pharmacy.getMedicinesList().size(); k++) {
            System.out.println("ID: " + k + " " + pharmacy.getMedicinesList().get(k));
        }
    }
}
