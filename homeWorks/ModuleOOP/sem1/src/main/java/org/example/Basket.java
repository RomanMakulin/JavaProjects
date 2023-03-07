package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Basket {

    Product[] buy;
    static int count = 0;

    public Basket(Product[] buy) {
        this.buy = buy;
    }

    //    ArrayList<Product> basketList;
//
    public Basket() {
        this.buy = new Product[10];
    }

    public void put(int numberProductCaterory, Product[] category) {
        buy[count] = category[numberProductCaterory];
        count++; // щелкаем позиции при добавлении нового товара
        category[numberProductCaterory] = null;
    }

    public void showBasket() {
        System.out.println(Arrays.toString(buy));
    }
//
//    public Basket(Product[] prodList) {
//        this.basketList = new ArrayList(List.of(prodList));
//    }
//
//    protected void clear() {
//        basketList.clear();
//    }
//
//    protected void addBasket(Product item) {
//        basketList.add(item);
//    }
//
//    protected void removeFromBasket(Product item) {
//        basketList.remove(item);
//    }
//
//    public void showBasket() {
//        System.out.println(basketList.toString() + "\n");
//    }
//
//    @Override
//    public String toString() {
//        return basketList.toString();
//    }


}
