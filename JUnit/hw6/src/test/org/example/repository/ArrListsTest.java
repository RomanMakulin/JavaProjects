package org.example.repository;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class ArrListsTest {

    ArrLists arrLists = new ArrLists();

    @Test // проверяем геттер на соответствие 1 листа
    void getList1() {
        assertEquals(arrLists.getList1(), Arrays.asList(1, 2, 5, 2, 1, 4));
    }

    @Test // проверяем геттер на соответствие 2 листа
    void getList2() {
        assertEquals(arrLists.getList2(), Arrays.asList(3, 2, 5, 1, 6, 4));
    }

    @Test // Проверяем содержимое листа на класс Integer
    void checkIntegersList2(){
        arrLists.getList2().forEach(item -> {
            assertEquals(item.getClass(), Integer.class);
        });
    }

    @Test // Проверяем содержимое листа на класс Integer
    void checkIntegersList1(){
        arrLists.getList1().forEach(item -> {
            assertEquals(item.getClass(), Integer.class);
        });
    }

    @Test // Проверяем что список не пустой
    void checkNotNull(){
        assertNotNull(arrLists.getList1());
        assertNotNull(arrLists.getList2());
    }
}