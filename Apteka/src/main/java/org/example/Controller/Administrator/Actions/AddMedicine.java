package org.example.Controller.Administrator.Actions;

import org.example.Model.Interfaces.UserService;
import org.example.Model.Medicines;
import org.example.Model.Pharmacy;
import org.example.View.Input.InputCountMedicine;
import org.example.View.Input.InputNameMedicine;
import org.example.View.Input.InputPriceMedicine;

import java.util.List;

public class AddMedicine implements UserService {
    @Override
    public void service(List<Pharmacy> pharmacyList, int i){
        pharmacyList.get(i).getMedicinesList().add(new Medicines(
                new InputNameMedicine().input(), new InputPriceMedicine().input(), new InputCountMedicine().input()));
    }
}
