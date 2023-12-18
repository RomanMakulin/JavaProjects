package org.example.UnitTests.h1.Shop;

import static org.assertj.core.api.Assertions.*;
import java.util.Arrays;

public class ShopTest {

    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */
    public static void main(String[] args) {

        Product product1 = new Product(100, "ball");
        Product product2 = new Product(10, "shake");
        Product product3 = new Product(500, "basket");

        Shop shop = new Shop(Arrays.asList(product1, product2, product3));

        assertThat(shop).isNotNull();
        assertThat(shop.getProducts()).isNotEmpty().hasSize(3);
        shop.sortProductsByPrice();
        // проверка правильности сортировки
        assertThat(shop.sortProductsByPrice().get(0)).isEqualTo(product2);
        assertThat(shop.sortProductsByPrice().get(1)).isEqualTo(product1);
        assertThat(shop.sortProductsByPrice().get(2)).isEqualTo(product3);

        shop.getProducts().forEach(System.out::println);
        System.out.println("----------");
        // проверка на большее значение
        assertThat(shop.getMostExpensiveProduct()).isEqualTo(product3);

        System.out.println("Самый дорогой товар: " + shop.getMostExpensiveProduct().getTitle());

    }

}