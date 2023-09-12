package org.example.homeWork4.Exceptions;

public class MyArrayDataException extends Exception{
    protected int x;
    protected int y;
    protected String message;

    @Override
    public String getMessage() {
        return message;
    }

    public MyArrayDataException(int x, int y) {
        this.message = "Не получилось преобразовать цифру в ячейке " + "[" + x + "," + y + "]";
        this.x = x;
        this.y = y;
    }


}
