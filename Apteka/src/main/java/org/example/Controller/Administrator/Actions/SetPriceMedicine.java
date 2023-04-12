package org.example.Controller.Administrator.Actions;

import org.example.Model.Interfaces.UserService;
import org.example.Model.Pharmacy;
import org.example.View.Input.InputIdMedicine;
import org.example.View.Input.InputPriceMedicine;

import java.util.List;

public class SetPriceMedicine implements UserService {
    @Override
    public void service(List<Pharmacy> pharmacyList, int i) {
        pharmacyList.get(i).getMedicinesList().get(
                new InputIdMedicine().input()).setPrice(new InputPriceMedicine().input());
    }
}
