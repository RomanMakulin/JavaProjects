package org.example.calk;

import java.util.ArrayList;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {

        Calk cal1 = new Calk();
        System.out.println(cal1.sum(new ArrayList<>(Arrays.asList(2.0, 3, 1))));
        System.out.println(cal1.mult(new ArrayList<>(Arrays.asList(2.0, 3, 2.5))));
        System.out.println();
        System.out.println(cal1.division(new ArrayList<>(Arrays.asList(30, 2, 3, 2))));


        System.out.println(cal1.binaryMethod("20"));

    }
}
