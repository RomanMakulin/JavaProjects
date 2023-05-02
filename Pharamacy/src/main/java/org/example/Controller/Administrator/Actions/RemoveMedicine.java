package org.example.Controller.Administrator.Actions;

import org.example.Model.Interfaces.UserService;
import org.example.Model.Pharmacy;
import org.example.View.Input.InputIdMedicine;
import org.example.View.ViewMedicine;

public class RemoveMedicine implements UserService {
    @Override
    public void service(Pharmacy pharmacy) {
        new ViewMedicine().service(pharmacy);
        pharmacy.getMedicinesList().remove(new InputIdMedicine().input());
    }
}
