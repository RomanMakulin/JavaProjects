package org.example.homeWork4;

import org.example.homeWork4.Exceptions.MyArraySizeException;
import org.example.homeWork4.View.ViewSizeInput;

public class Main {
    public static void main(String[] args) {

        int sizeX = new ViewSizeInput().input("Input X: ");
        int sizeY = new ViewSizeInput().input("Input Y: ");

        String[][] arr = new String[sizeX][sizeY];

        try {
            new CheckSizeArray().checkSize(sizeX, sizeY);
            new ArrayWork().fill(arr, sizeX, sizeY);
            new ArrayWork().print(arr, sizeX, sizeY);
            new SumArr().sum(arr, sizeX, sizeY);
        } catch (MyArraySizeException e){
            System.out.println(e.getMessage());
        }



    }

}
