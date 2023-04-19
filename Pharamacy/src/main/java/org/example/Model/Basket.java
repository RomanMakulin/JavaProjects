package org.example.Model;

import org.example.View.Input.InputCountMedicine;
import org.example.View.Input.InputIdMedicine;
import org.example.View.NotEnoughMoney;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    public List<Medicines> basketList;

    public Basket() {
        this.basketList = new ArrayList<>();
    }

    public void put(List<Medicines> medicinesList, List<Pharmacy> pharmacyList, int i, int j) {

        int id = new InputIdMedicine().input();
        int needCount = new InputCountMedicine().input();
        int newCurrent = medicinesList.get(id).getCount() - needCount;
        int tempPrice = medicinesList.get(id).getPrice() * needCount;

        if (pharmacyList.get(i).getUserList().get(j).getMoney() >= tempPrice){
            if (newCurrent >= 0) {
                medicinesList.get(id).setCount(newCurrent);
                basketList.add(new Medicines(medicinesList.get(id).getName(), medicinesList.get(id).getPrice(), needCount));

                int tempMoney = pharmacyList.get(i).getUserList().get(j).getMoney();
                pharmacyList.get(i).getUserList().get(j).setMoney(tempMoney - tempPrice);
            }
        }else new NotEnoughMoney().show();


    }

    public int size(){
        return basketList.size();
    }
    public Medicines get(int i){
        return basketList.get(i);
    }

    @Override
    public String toString() {
        return "Basket: " + basketList;
    }
}
