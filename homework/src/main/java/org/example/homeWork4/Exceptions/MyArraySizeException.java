package org.example.homeWork4.Exceptions;

public class MyArraySizeException extends Exception {
    protected int sizeX;
    protected int sizeY;
    protected String message;
    public int getSizeX() {
        return sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public MyArraySizeException(int sizeX, int sizeY) {
        this.message = "Размер массива должен быть 4х4!";
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }
}
