package org.example.work3;

//Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true,
// если они одинаковые, и false в противном случае. Массивы могут быть любого типа данных,
// но должны иметь одинаковую длину и содержать элементы одного типа.
public class ArraysCheck {
    public <T> boolean compareArrays(T[] arr, T[] arr2){
        boolean checkLength = arr.length == arr2.length;
        boolean checkClassName = arr.getClass().getName().equals(arr2.getClass().getName());
        return checkLength && checkClassName;
    }

    public static void main(String[] args) {
        ArraysCheck arraysCheck = new ArraysCheck();
        Integer[] arr = new Integer[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        String[] arr2 = new String[3];
        arr2[0] = "he";
        arr2[1] = "ll";
        arr2[2] = "o";

        System.out.println(arraysCheck.compareArrays(arr, arr2));
    }
}
