package org.example.Controller.Administrator.Actions;

import org.example.Model.Interfaces.UserService;
import org.example.Model.Pharmacy;
import org.example.View.Input.InputIdMedicine;
import org.example.View.ViewMedicine;

import java.util.List;

public class RemoveMedicine implements UserService {
    @Override
    public void service(List<Pharmacy> pharmacyList, int i) {
        new ViewMedicine().service(pharmacyList, i);
        pharmacyList.get(i).getMedicinesList().remove(new InputIdMedicine().input());
    }
}
