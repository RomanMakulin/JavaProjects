package org.example.View;

import org.example.Model.Pharmacy;

import java.util.List;
import java.util.Scanner;

public class SwitchPharmacy {
    public String input(List<Pharmacy> pharmacyList){
        new ViewPharmacy().show(pharmacyList);
        System.out.print("\nChoose a pharmacy (input name): ");
        return new Scanner(System.in).nextLine();
    }
}
