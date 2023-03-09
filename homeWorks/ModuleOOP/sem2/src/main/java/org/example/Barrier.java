package org.example;

public class Barrier {
    protected String name;
    protected int valueBarrier;
    protected String type;

    public Barrier(String name, int valueBarrier, String type) {
        this.name = name;
        this.valueBarrier = valueBarrier;
        this.type = type;
    }

    public String getInfoBarrier(){
        return String.format("type barrier: %s, value: %d, type: %s", name, valueBarrier, type);
    }

    public int getVal(){
        return valueBarrier;
    }

    public String getType(){
        return type;
    }

}
