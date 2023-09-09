package org.example.homeWork4;

import org.example.homeWork4.Exceptions.MyArrayDataException;

public class checkNumeric {
    public boolean isNumeric(String[][] arr, int i, int j) {
        try {
            Integer.parseInt(arr[i][j]);
            return true;
        } catch (NumberFormatException e) {
            System.out.println(new MyArrayDataException(i, j).getMessage());
            return false;
        }
    }
}
