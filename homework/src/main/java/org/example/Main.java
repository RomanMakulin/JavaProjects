package org.example;

import java.util.Scanner;

public class Main {

    private static char HUMAN_POINT = 'X';
    private static char COMP_POINT = '0';
    private static char EMPTY_POINT = '*';
    private static short X_LENGTH = 3;
    private static short Y_LENGTH = 3;
    private static char[][] DESC;


    public static void main(String[] args) {
        initDesc();
        printDesc();
        humanChoice();
        printDesc();
    }

    public static void initDesc(){
        DESC = new char[X_LENGTH][Y_LENGTH];

        for (int i = 0; i < X_LENGTH; i++) {
            for (int j = 0; j < Y_LENGTH; j++) {
                DESC[i][j] = EMPTY_POINT;
            }
        }
    }
    
    public static void printDesc(){
        StringBuilder str = new StringBuilder();
        str.append(" ");

        for (int i = 0; i < Y_LENGTH; i++) {
            str.append(" ").append(i + 1);
        }
        System.out.println(str);

        for (int i = 0; i < X_LENGTH; i++) {
            System.out.print(i + 1 + "|");
            for (int j = 0; j < Y_LENGTH; j++) {
                System.out.print(DESC[i][j] + "|");
            }
            System.out.println();
        }
    }

    public static void humanChoice(){
        System.out.printf("Введите значение Х (от 1 до %d): ", X_LENGTH);
        int x = new Scanner(System.in).nextInt() - 1;
        // тут бы помогло ООП )) впрочем как и везде...
        System.out.printf("Введите значение Y (от 1 до %d): ", Y_LENGTH);
        int y = new Scanner(System.in).nextInt() - 1;

        if (isEmpty(x, y) || xyRange(x, y)) DESC[x][y] = HUMAN_POINT;
    }

    public static boolean isEmpty(int x, int y){
        return DESC[x][y] == EMPTY_POINT;
    }
    public static boolean xyRange(int x, int y){
        return x >= 0 && x < X_LENGTH && y >= 0 && y < Y_LENGTH;
    }

}