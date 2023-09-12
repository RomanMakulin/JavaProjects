package org.example.homeWork4;

import org.example.homeWork4.Exceptions.MyArraySizeException;

public class CheckSizeArray {
    public void checkSize(int sizeX, int sizeY) throws MyArraySizeException {
        if (!(sizeX == 4 && sizeY == 4)) {
            throw new MyArraySizeException(sizeX, sizeY);
        }
    }
}
