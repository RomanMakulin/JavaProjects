package org.example.Controller.Login;

import org.example.Model.Pharmacy;

import java.util.List;

public interface CheckingUser {
    public boolean check(List<Pharmacy> pharmacyList, int i, int j);
}
