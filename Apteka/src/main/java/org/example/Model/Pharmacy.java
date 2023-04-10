package org.example.Model;

import java.util.ArrayList;
import java.util.List;

public class Pharmacy {
    private String name;
    private String status;
    List<Medicines> medicinesList;
    List<User> userList;

    public Pharmacy(String name, String status, List<Medicines> medicinesList) {
        this.name = name;
        this.status = status;
        this.medicinesList = medicinesList;
        this.userList = new ArrayList<>();
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

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
