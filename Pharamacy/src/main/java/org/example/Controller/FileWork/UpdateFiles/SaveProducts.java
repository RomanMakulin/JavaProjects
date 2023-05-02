package org.example.Controller.FileWork.UpdateFiles;

import org.example.Model.Medicines;
import org.example.Model.Pharmacy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

public class SaveProducts {
    public void save(List<Medicines> medicinesList, List<Pharmacy> pharmacyList, int i){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pharmacyList.get(i).getName() + "/productList.csv"));
            for (int l = 0; l < medicinesList.size(); l++) {
                Medicines medicines = medicinesList.get(l);
                bufferedWriter.write(medicines.getName() + ";" + medicines.getPrice() + ";" + medicines.getCount() + "\n");
            }
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
