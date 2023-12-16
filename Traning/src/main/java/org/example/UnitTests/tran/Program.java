package org.example.UnitTests.tran;

import static org.assertj.core.api.Assertions.*;

public class Program {
    public static void main(String[] args) {
        assertThat(calk(4, 2, '-')).isNotZero().isNotNegative(); // прописываем каким должен быть результат
        System.out.printf("Result: %s", calk(4, 2, '-'));
    }

    public static int calk(int a, int b, char c) {
        switch (c) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                System.out.println("wrong input");
                break;
        }
        return 0;
    }
}
