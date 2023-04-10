package org.example.View;

import org.example.Model.Pharmacy;

import java.util.List;
import java.util.Scanner;

public class SwitchPharmacy {
    public String input(List<Pharmacy> pharmacyList){

        for (int i = 0; i < pharmacyList.size(); i++) {
            System.out.println(pharmacyList.get(i).getName());
        }

        System.out.println("Выберите аптеку (введите название): ");
        return new Scanner(System.in).nextLine();
    }
}
