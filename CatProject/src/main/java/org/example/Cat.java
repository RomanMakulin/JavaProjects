package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data // создание get set методов
//@AllArgsConstructor // создание конструтора автоматического
//@NoArgsConstructor // создание пустого конструктора

public class Cat extends Animal {

    static int catCount;

    public Cat(String name, int maxSwimDist, String type) {
        super(name, 200, maxSwimDist, "Кошка");
        catCount++;
    }

    public Cat() {
    }


}
