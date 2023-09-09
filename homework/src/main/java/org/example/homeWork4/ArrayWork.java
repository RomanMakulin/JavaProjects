package org.example.homeWork4;

import java.util.Random;

public class ArrayWork {
    public void fill (String[][] arr, int sizeX, int sizeY){
        Random random = new Random();
        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                if (random.nextInt(2) == 1) arr[i][j] = "1";
                else arr[i][j] = "a";
            }
        }
    }
    public void print(String[][] arr, int sizeX, int sizeY){
        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
