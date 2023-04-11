package org.example.Controller.MedicinesContent;

import org.example.Model.Medicines;

import java.util.ArrayList;
import java.util.List;

public class ForBeHealth implements GenerateMedicines{
    @Override
    public List<Medicines> generateList() {
        medicinesList.add(new Medicines("Pentalgin", 500, 10));
        medicinesList.add(new Medicines("Antolgin", 500, 10));
        medicinesList.add(new Medicines("Swilgin", 500, 10));
        return medicinesList;
    }
}
