package org.example.Model;

import java.util.List;

public class Pharmacy {
    private String name;
    private String status;
    List<Medicines> medicinesList;

    public Pharmacy(String name, String status, List<Medicines> medicinesList) {
        this.name = name;
        this.status = status;
        this.medicinesList = medicinesList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Medicines> getMedicinesList() {
        return medicinesList;
    }

    public void setMedicinesList(List<Medicines> medicinesList) {
        this.medicinesList = medicinesList;
    }
}
