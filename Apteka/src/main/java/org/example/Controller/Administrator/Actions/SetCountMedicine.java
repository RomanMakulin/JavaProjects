package org.example.Controller.Administrator.Actions;

import org.example.Model.Interfaces.UserService;
import org.example.Model.Pharmacy;
import org.example.View.Input.InputCountMedicine;
import org.example.View.Input.InputIdMedicine;

import java.util.List;

public class SetCountMedicine implements UserService {
    @Override
    public void service(List<Pharmacy> pharmacyList, int i) {
        pharmacyList.get(i).getMedicinesList().get(
                new InputIdMedicine().input()).setCount(new InputCountMedicine().input());
    }
}
