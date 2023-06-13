package org.example.HeapSort;

public class FillArray {
    public static void fill(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50);
        }
    }
}
