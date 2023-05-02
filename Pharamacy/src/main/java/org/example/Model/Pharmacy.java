package org.example.Model;

import org.example.Controller.FileWork.ReadProducts.ReadProducts;
import org.example.Controller.FileWork.ReadUsers.ReadUsers;

import java.util.ArrayList;
import java.util.List;

public class Pharmacy {
    private String name;
    private List<Medicines> medicinesList;
    private List<User> userList;

    public Pharmacy(String name, String pathProducts, String pathUsers) {
        this.name = name;
        this.medicinesList = new ReadProducts().generate(pathProducts);
        this.userList = new ReadUsers().generate(pathUsers);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Pharmacy{" +
                "name='" + name + '\'' +
                ", medicinesList=" + medicinesList +
                ", userList=" + userList +
                '}';
    }
}
