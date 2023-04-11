package org.example.Controller.Administrator;

import org.example.Model.Pharmacy;
import org.example.View.InputIdMedicine;
import org.example.View.InputNameMedicine;

import java.util.List;

public class SetNameMedicine implements UserService {
    @Override
    public void service(List<Pharmacy> pharmacyList, int i) {
        pharmacyList.get(i).getMedicinesList().get(
                new InputIdMedicine().input()).setName(new InputNameMedicine().input());
    }
}
