package org.example.Model;

public class ATM {
    AtmStatus atmStatus;
    private static int count;
    private int ID;

    public ATM() {
        this.atmStatus = AtmStatus.ON;
        this.ID = count;
        this.count++;
    }

    @Override
    public String toString() {
        return "ATM #" + ID + ", status: " + atmStatus;
    }

    public AtmStatus getAtmStatus() {
        return atmStatus;
    }

    public void setAtmStatus(AtmStatus atmStatus) {
        this.atmStatus = atmStatus;
    }
}
