package org.example.Controller.MedicinesContent;

import org.example.Model.Medicines;

import java.util.ArrayList;
import java.util.List;

public interface GenerateMedicines {
    List<Medicines> medicinesList = new ArrayList<>();
    public List<Medicines> generateList();
}
