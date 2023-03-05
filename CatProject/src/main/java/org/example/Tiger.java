package org.example;

public class Tiger extends Cat {

    static int TigerCount;

    public Tiger(String name, int maxSwimDist) {
        super(name, maxSwimDist, "Тигр");
        TigerCount++;
    }
}
