package org.example.Controller.Login;

import org.example.Model.Administrator;
import org.example.Model.Pharmacy;

import java.util.List;

public class CheckAdmStatus {
    public boolean check(List<Pharmacy> pharmacyList, int i, int j){
        return pharmacyList.get(i).getUserList().get(j) instanceof Administrator;
    }
}
