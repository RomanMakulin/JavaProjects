package org.example;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    ArrayList<Product> basketList;

    public Basket() {
        this.basketList = new ArrayList<>();
    }

    public Basket(Product[] prodList) {
        this.basketList = new ArrayList(List.of(prodList));
    }

    protected void clear(){
        basketList.clear();
    }
    protected void addBasket(Product item){
        basketList.add(item);
    }

    protected  void removeFromBasket(Product item){
        basketList.remove(item);
    }

    protected void showBasket(){
        System.out.println(basketList.toString());
    }

    @Override
    public String toString() {
        return basketList.toString();
    }
}
