package org.example.Controller.Administrator.Actions;

import org.example.Model.Interfaces.UserService;
import org.example.Model.Pharmacy;
import org.example.View.Input.InputCountMedicine;
import org.example.View.Input.InputIdMedicine;

public class SetCountMedicine implements UserService {
    @Override
    public void service(Pharmacy pharmacy) {
        pharmacy.getMedicinesList().get(new InputIdMedicine().input()).setCount(new InputCountMedicine().input());
    }
}
