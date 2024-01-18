package org.example.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ArrServiceImplTest {
    ArrServiceImpl arrService = new ArrServiceImpl();

    @Test // Проверка функции подсчета среднего значения
    void averageList() {
        assertEquals(arrService.averageList(Arrays.asList(1, 2, 5, 2, 1, 4)), 2.5);
    }

    @Test // Проверка наибольшего значения в списках
    void checkValues() {
        double num1 = 5.5;
        double num2 = 5.5;

        if (num1 > num2) assertEquals(arrService.checkValues(num1, num2), num1);
        else if (num2 > num1) assertEquals(arrService.checkValues(num1, num2), num2);
        else assertEquals(arrService.checkValues(num1, num2), 0);
    }
}