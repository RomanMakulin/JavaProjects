package org.example.Model;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    public List<Medicines> getBasketList() {
        return basketList;
    }

    public void setBasketList(List<Medicines> basketList) {
        this.basketList = basketList;
    }

    private List<Medicines> basketList;

    public Basket() {
        this.basketList = new ArrayList<>();
    }

    public int size() {
        return basketList.size();
    }

    public Medicines get(int i) {
        return basketList.get(i);
    }

    @Override
    public String toString() {
        return "Basket: " + basketList;
    }
}
