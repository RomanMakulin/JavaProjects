package org.example;

import java.util.PrimitiveIterator;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private final static char HUMAN_POINT = 'X';
    private final static char COMP_POINT = '0';
    private final static char EMPTY_POINT = '*';
    private final static short X_LENGTH = 5;
    private final static short Y_LENGTH = 5;
    private final static int operationsCount = 3;
    private static char[][] DESC;


    public static void main(String[] args) {

        initDesc();
        printDesc();

        while (true) {

            winner();

            if (checkStatus()) {
                humanChoice();
            } else break;


            if (checkStatus()) {
                compChoice();
            } else break;

            printDesc();


            // check right


        }

    }

    public static void winner() {

        for (int i = 0; i < X_LENGTH; i++) {
            int count = 0;
            for (int j = 0; j < Y_LENGTH; j++) {

                if (EMPTY_POINT != DESC[i][j]) {
                    if (j + 1 < Y_LENGTH && i + 1 < X_LENGTH) {

                        // right
                        if (DESC[i][j] == DESC[i][j + 1]) {
                            count++;
                            if (count == operationsCount - 1) {
                                System.out.println("finish: " + DESC[i][j] + " " + i + " " + j);
                                System.exit(1);
                            }
                        } else count = 0;




                    }
                }

            }
        }



        for (int i = 0; i < X_LENGTH; i++) {
            int count = 0;
            for (int j = 0; j < Y_LENGTH; j++) {

                if (EMPTY_POINT != DESC[i][j]) {
                    if (j + 1 < Y_LENGTH && i + 1 < X_LENGTH) {

                        // down
                        if (DESC[j][i] == DESC[j][i+1]) {
                            count++;
                            if (count == operationsCount - 1) {
                                System.out.println("finish: " + DESC[i][j] + " " + i + " " + j);
                                System.exit(1);
                            }
                        } else count = 0;
                    }
                }

            }
        }
    }

    public static void printWin(int i, int j) {
        System.out.println("pobeda " + DESC[i][j]);
    }

    public static boolean checkWin(int combinationY, int combinationX, int combinationZ, int combinationN) {

        for (int i = 0; i <= X_LENGTH; i++) {
            for (int j = 0; j <= Y_LENGTH; j++) {

                try {
                    if (EMPTY_POINT != DESC[i][j]) {

                        if (DESC[i][j] == DESC[i][j + 1]) {
                            combinationY--;
                            if (combinationY == 1) {
                                printWin(i, j);
                                return false;
                            }
                        }

                        if (DESC[i + 1][j] == DESC[i][j]) {
                            combinationX--;
                            if (combinationX == 1) {
                                printWin(i, j);
                                return false;
                            }
                        }

                        if (DESC[i][j] == DESC[i + 1][j + 1]) {
                            combinationZ--;
                            if (combinationZ == 1) {
                                printWin(i, j);
                                return false;
                            }
                        }

                        if (DESC[i + 1][j + 1] == DESC[i][j]) {
                            combinationN--;
                            if (combinationN == 1) {
                                printWin(i, j);
                                return false;
                            }
                        }
                    }
                } catch (ArrayIndexOutOfBoundsException e) {

                }

            }
        }
        return true;

    }

    public static boolean checkStatus() {
        for (int i = 0; i < X_LENGTH; i++) {
            for (int j = 0; j < Y_LENGTH; j++) {
                if (DESC[i][j] == EMPTY_POINT) return true;
            }
        }
        System.out.println("Ничья");
        return false;
    }

    public static void initDesc() {
        DESC = new char[X_LENGTH][Y_LENGTH];

        for (int i = 0; i < X_LENGTH; i++) {
            for (int j = 0; j < Y_LENGTH; j++) {
                DESC[i][j] = EMPTY_POINT;
            }
        }
    }

    public static void printDesc() {
        StringBuilder str = new StringBuilder();
        str.append(" ");

        for (int i = 0; i < Y_LENGTH; i++) {
            str.append(" ").append(i);
        }
        System.out.println(str);

        for (int i = 0; i < X_LENGTH; i++) {
            System.out.print(i + "|");
            for (int j = 0; j < Y_LENGTH; j++) {
                System.out.print(DESC[i][j] + "|");
            }
            System.out.println();
        }
    }

    public static void humanChoice() {
        while (true) {
            System.out.printf("Введите значение Х (от 0 до %d): ", X_LENGTH - 1);
            int x = new Scanner(System.in).nextInt();
            // тут бы помогло ООП )) впрочем как и везде...
            System.out.printf("Введите значение Y (от 0 до %d): ", Y_LENGTH - 1);
            int y = new Scanner(System.in).nextInt();

            if (xyRange(x, y) && isEmpty(x, y)) {
                DESC[x][y] = HUMAN_POINT;
                break;
            } else System.out.println("Wrong input!\n");
        }
    }

    public static void compChoice() {


        while (true) {
            int x = new Random().nextInt(X_LENGTH);
            int y = new Random().nextInt(Y_LENGTH);

            if (isEmpty(x, y)) {
                DESC[x][y] = COMP_POINT;
                break;
            }
        }

    }

    public static boolean isEmpty(int x, int y) {
        return DESC[x][y] == EMPTY_POINT;
    }

    public static boolean xyRange(int x, int y) {
        return x >= 0 && x < X_LENGTH && y >= 0 && y < Y_LENGTH;
    }

}