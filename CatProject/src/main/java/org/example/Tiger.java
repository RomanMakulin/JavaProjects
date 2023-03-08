package org.example;

public class Tiger extends Cat {

    static int TigerCount;

    public Tiger(String name) {
        super(name, 900, 50, "Тигр");
        TigerCount++;
    }
}
