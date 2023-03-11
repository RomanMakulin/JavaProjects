package org.example;

public enum Month {
    JAN(1), FEB(2), MAR(3), APR(4), MAY(5), JUN(6), JUL(7);
    int index;

    Month(int index) {
        this.index = index;
    }

    Month() {
    }

    public int getIndex() {
        return index;
    }
}
