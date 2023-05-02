package org.example.Controller.FileWork.UpdateFiles;

import org.example.Model.Medicines;
import org.example.Model.Pharmacy;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class SaveProducts {
    public void save(Pharmacy pharmacy){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pharmacy.getName() + "/productList.csv"));
            for (int l = 0; l < pharmacy.getMedicinesList().size(); l++) {
                Medicines medicines = pharmacy.getMedicinesList().get(l);
                bufferedWriter.write(medicines.getName() + ";" + medicines.getPrice() + ";" + medicines.getCount() + "\n");
            }
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
