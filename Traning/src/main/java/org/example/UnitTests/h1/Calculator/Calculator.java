package org.example.UnitTests.h1.Calculator;

import static org.assertj.core.api.Assertions.*;
public class Calculator {

    // Нужно написать в калькуляторе метод вычисления суммы покупки со скидкой и проверить его, используя AssertJ
    // Примерная сигнатура и тело метода:
    public double calculatingDiscount(double purchaseAmount, int discountAmount) {
        // purchaseAmount - сумма покупки
        // discountAmount - размер скидки
        assertThat(purchaseAmount).isNotNegative().isNotZero().isNotNaN().isNotNull();
        assertThat(discountAmount).isNotNegative().isBetween(0, 99);
        return purchaseAmount*discountAmount/100; // Метод должен возвращать сумму покупки со скидкой
    }
}