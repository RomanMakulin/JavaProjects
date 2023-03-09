package org.example;

import java.util.Objects;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // массив атлетов
        Athletes[] athlete = {
                new Human("Roman", 1000, 3),
                new Cat("Milka", 500, 3),
                new Robot("JoJo v1.0", 3000, 5)
        };

        // массив препятствий
        Barrier[] barriers = {
                new Wall(2),
                new Runroad(1500),
                new Wall(4)
        };

        for (int i = 0; i < barriers.length; i++) {
            for (int j = 0; j < athlete.length; j++) {
                if (barriers[i].type == "run" && athlete[j] != null) {
                    if (athlete[j].maxRunDistance >= barriers[i].getVal()) {
                        athlete[j].run();
                        athlete[j].maxRunDistance -= barriers[i].getVal();
                        System.out.println("Остались силы пробюежать ещё " + athlete[j].maxRunDistance + " м.");
                        System.out.println();
                    } else {
                        System.out.println("[" + athlete[j].type + "] " + athlete[j].name + " выбывает!");
                        athlete[j] = null;
                    }
                } else if (athlete[j] != null) {
                    if (athlete[j].maxJumpHight >= barriers[i].getVal()) {
                        athlete[j].jump();
                        athlete[j].maxJumpHight -= barriers[i].getVal();
                        System.out.println("Остались силы прыгнуть на " + athlete[j].maxJumpHight + " м.");
                        System.out.println();
                    } else {
                        System.out.println("[" + athlete[j].type + "] " + athlete[j].name + " выбывает!");
                        athlete[j] = null;
                    }
                }
            }
            System.out.println();
        }
    }
}