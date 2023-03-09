package org.example;

public class Barrier {
    protected String name;
    protected int valueBarrier;


    public Barrier(String name, int valueBarrier) {
        this.name = name;
        this.valueBarrier = valueBarrier;
    }

    public String getInfoBarrier(){
        return String.format("type barrier: %s, value: %d, type: %s", name, valueBarrier);
    }

    public int getVal(){
        return valueBarrier;
    }

}
