package org.example.Controller;

import org.example.Model.Medicines;
import org.example.Model.Pharmacy;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public void buttonClick(){

        List<Medicines> medicinesList = new ArrayList<>();
        medicinesList.add(new Medicines("Pentalgin", 500, 10));
        medicinesList.add(new Medicines("Antolgin", 500, 10));
        medicinesList.add(new Medicines("Swilgin", 500, 10));

        Pharmacy pharmacy = new Pharmacy("Будь здоров", "on", medicinesList);



    }

}
