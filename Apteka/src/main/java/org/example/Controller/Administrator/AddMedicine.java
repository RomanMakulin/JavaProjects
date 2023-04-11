package org.example.Controller.Administrator;

import org.example.Model.Medicines;
import org.example.Model.Pharmacy;
import org.example.View.InputCountMedicine;
import org.example.View.InputNameMedicine;
import org.example.View.InputPriceMedicine;

import java.util.List;

public class AddMedicine implements UserService {
    @Override
    public void service(List<Pharmacy> pharmacyList, int i){
        pharmacyList.get(i).getMedicinesList().add(new Medicines(
                new InputNameMedicine().input(), new InputPriceMedicine().input(), new InputCountMedicine().input()));
    }
}
