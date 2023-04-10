package org.example.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Basket{
    List<Medicines> busketList;

    public Basket() {
        this.busketList = new ArrayList<>();
    }

    public void put(List<Medicines> medicinesList){
        System.out.println("Введите ID товара для добавления в корзину: ");
        int id = new Scanner(System.in).nextInt();

        for (int i = 0; i < medicinesList.size(); i++) {
            busketList.add(medicinesList.get(id));
            medicinesList.remove(id);
        }
    }
}
