package org.example.HeapSort;

public class HeapSort {

    public static void sort(int[] array){

        // Построение дерева
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            heapify(array, array.length, i);
        }

        // Сортировка
        for (int i = array.length - 1; i >= 0 ; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }
    }

    private static void heapify(int[] array, int length, int index) {
        int max = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if (left < length && array[left] > array[max]){
            max = left;
        }
        if (right < length && array[right] > array[max]){
            max = right;
        }
        if (max != index) {
            int temp = array[index];
            array[index] = array[max];
            array[max] = temp;

            heapify(array, length, max);
        }
    }
}
