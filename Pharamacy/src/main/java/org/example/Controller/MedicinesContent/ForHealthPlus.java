package org.example.Controller.MedicinesContent;

import org.example.Model.Interfaces.GenerateMedicines;
import org.example.Model.Medicines;

import java.util.ArrayList;
import java.util.List;

public class ForHealthPlus implements GenerateMedicines {
    @Override
    public List<Medicines> generateList() {
        List<Medicines> medicinesList = new ArrayList<>();
        medicinesList.add(new Medicines("Analgin", 500, 10));
        medicinesList.add(new Medicines("Capoprin", 500, 10));
        medicinesList.add(new Medicines("Vasilin", 500, 10));
        return medicinesList;
    }
}
