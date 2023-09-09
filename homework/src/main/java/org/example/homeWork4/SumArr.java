package org.example.homeWork4;

public class SumArr {
    public void sum(String[][] arr, int sizeX, int sizeY){
        int sum = 0;
        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                if (new checkNumeric().isNumeric(arr, i, j)) {
                    sum += Integer.parseInt(arr[i][j]);
                }
            }
        }
        System.out.println("Sum int elements: " + sum);
    }
}
