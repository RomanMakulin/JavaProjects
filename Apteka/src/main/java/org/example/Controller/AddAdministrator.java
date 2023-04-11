package org.example.Controller;

import org.example.Model.Administrator;
import org.example.Model.Pharmacy;

import java.util.List;

public class AddAdministrator {
    public void create(List<Pharmacy> pharmacyList){
        for (int i = 0; i < pharmacyList.size(); i++) {
            pharmacyList.get(i).getUserList().add(new Administrator("adm", 123));
        }
    }
}
