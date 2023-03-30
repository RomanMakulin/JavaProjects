package org.example.example.Model.Barrier;

public abstract class Barriers {
    private String typeName;
    private int valueBarrier;

    public Barriers(String typeName, int valueBarrier) {
        this.typeName = typeName;
        this.valueBarrier = valueBarrier;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public int getValueBarrier() {
        return valueBarrier;
    }

    public void setValueBarrier(int valueBarrier) {
        this.valueBarrier = valueBarrier;
    }

    @Override
    public String toString() {
        return "typeName: " + typeName +
                ", valueBarrier: " + valueBarrier;
    }
}
