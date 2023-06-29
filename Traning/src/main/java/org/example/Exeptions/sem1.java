package org.example.Exeptions;

public class sem1 {
    public static void main(String[] args) {
        Integer[] arr1 = {5, 3, 3, 4, 8, 10};
        Integer[] arr2 = {1, 2, 3, 4, 5};
        Integer[] arr = {null, 2, 4, 6};

        // Integer[] res1 = raznost1(arr1, arr2);
        // Integer[] res2 = raznost2(arr1, arr2);

        // print(res1);
        // print(res2);

        // System.out.println(method1(arr1, 20)); // first ex
        // System.out.println(method2(10, 0));

        System.out.println(method3(arr, 0));

        // ТИПЫ ИСКЛЮЧЕНИЙ: разные длины массива, не цифры в строке (ошибка парсинка)


    }

    public static void print(Integer[] res){
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    public static Integer[] raznost2(Integer[] arr1, Integer[] arr2) {

        Integer[] res = new Integer[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            if (i >= arr2.length) {
                System.out.println("Длина второго массива меньше. Будет null");
            } else {
                res[i] = arr1[i] - arr2[i];
            }
        }
        return res;
    }

    public static Integer[] raznost1(Integer[] arr1, Integer[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов разные");
        }

        Integer[] res = new Integer[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            res[i] = arr1[i] - arr2[i];
        }

        return res;
    }

    public static int method1(Integer[] array, int find){
        if (find > array.length){
            throw new ArrayIndexOutOfBoundsException("index > lenth");
        } else return array[find];
    }

    public static double method2(double a, double b){
        if (b != 0){
            return a/b;
        } else{
            throw new RuntimeException("Div 0");
        }
    }

    public static int method3(Integer[] arr, int find){
        try {
            return arr[find];
        } catch (NullPointerException e){
            System.out.println("Null position");
            return -1;
        }
    }

}

