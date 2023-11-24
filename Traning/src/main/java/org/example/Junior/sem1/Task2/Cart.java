package org.example.Junior.sem1.Task2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Корзина
 *
 * @param <T> Еда
 */
public class Cart<T extends Food> {

    /**
     * Товары в магазине
     */
    private final ArrayList<T> foodstuffs;
    private final UMarket market;
    private final Class<T> clazz;

    public Cart(Class<T> clazz, UMarket market) {
        this.clazz = clazz;
        this.market = market;
        foodstuffs = new ArrayList<>();
    }

    public Collection<T> getFoodstuffs() {
        return foodstuffs;
    }

    /**
     * Распечатать список продуктов в корзине
     */
    public void printFoodstuffs() {
        AtomicInteger index = new AtomicInteger(1);
        foodstuffs.forEach(food -> {
            System.out.printf("[%d] %s (Белки: %s Жиры: %s Углеводы: %s)\n",
                    index.getAndIncrement(), food.getName(),
                    food.getProteins() ? "Да" : "Нет",
                    food.getFats() ? "Да" : "Нет",
                    food.getCarbohydrates() ? "Да" : "Нет");
        });
    }

    /**
     * Балансировка корзины
     */
    public void cardBalancing() {
        boolean[] proteins = {false};
        boolean[] fats = {false};
        boolean[] carbohydrates = {false};

        foodstuffs.forEach(item -> {
            if (item.getProteins()) proteins[0] = true;
            else if (item.getFats()) fats[0] = true;
            else if (item.getCarbohydrates()) carbohydrates[0] = true;
        });

        if (proteins[0] && fats[0] && carbohydrates[0]) System.out.println("Корзина уже сбалансирована по БЖУ.");
        else {
            market.getThings(Food.class).forEach(item -> {
                if (!proteins[0] && item.getProteins()) {
                    proteins[0] = true;
                    foodstuffs.add((T) item);
                } else if (!fats[0] && item.getFats()) {
                    fats[0] = true;
                    foodstuffs.add((T) item);
                } else if (!carbohydrates[0] && item.getCarbohydrates()) {
                    carbohydrates[0] = true;
                    foodstuffs.add((T) item);
                }
            });
            if (proteins[0] && fats[0] && carbohydrates[0]) System.out.println("Корзина сбалансирована по БЖУ.");
            else System.out.println("Не удалось сбалансировать");
        }
    }

}
