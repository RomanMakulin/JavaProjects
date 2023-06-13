package org.example.HeapSort;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[10];

        FillArray.fill(array);
        PrintArray.print(array);
        HeapSort.sort(array);
        PrintArray.print(array);

    }
}