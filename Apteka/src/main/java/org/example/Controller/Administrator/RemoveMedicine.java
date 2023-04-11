package org.example.Controller.Administrator;

import org.example.Model.Pharmacy;
import org.example.View.InputIdMedicine;
import org.example.View.ViewMedicine;

import java.util.List;

public class RemoveMedicine implements UserService {
    @Override
    public void service(List<Pharmacy> pharmacyList, int i) {
        new ViewMedicine().show(pharmacyList, i);
        pharmacyList.get(i).getMedicinesList().remove(new InputIdMedicine().input());
    }
}
