package org.example.UnitTests.h1.Calculator;


public class Calculator {

    // Нужно написать в калькуляторе метод вычисления суммы покупки со скидкой и проверить его, используя AssertJ
    // Примерная сигнатура и тело метода:
    public double calculatingDiscount(double purchaseAmount, int discountAmount) {
        // purchaseAmount - сумма покупки
        // discountAmount - размер скидки

        return purchaseAmount*discountAmount/100; // Метод должен возвращать сумму покупки со скидкой
    }
}