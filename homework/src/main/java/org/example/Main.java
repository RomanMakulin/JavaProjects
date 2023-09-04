package org.example;

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

            if (checkStatus()) {
                humanChoice();
            } else break;

            winner();

            if (checkStatus()) {
                compChoice();
            } else break;

            winner();

            printDesc();

        }

    }

    public static boolean equalsX(int i, int j) {
        return DESC[i][j] == DESC[i][j + 1] & EMPTY_POINT != DESC[i][j];
    }

    public static boolean equalsY(int i, int j) {
        return DESC[j][i] == DESC[j + 1][i] & EMPTY_POINT != DESC[j][i];
    }

    public static boolean rangeZ(int i, int j, int countZ) {
        return ((i + countZ) < X_LENGTH) & ((j + countZ) < Y_LENGTH);
    }

    public static boolean equalsZ(int i, int j, int countZ) {
        return DESC[i][j] == DESC[i + countZ][j + countZ] & EMPTY_POINT != DESC[i][j];
    }

    public static boolean rangeN(int i, int j, int countN) {
        return i + countN < X_LENGTH && j - countN >= 0;
    }


    public static boolean equalsN(int i, int j, int countN) {
        return EMPTY_POINT != DESC[i][j] && DESC[i][j] == DESC[i + countN][j - countN];
    }

    public static int checkXY(int countX, boolean equalsCheck) {
        if (equalsCheck) {
            countX++;
            if (countX == operationsCount - 1) {
                printWin();
                System.exit(1);
            }
        } else countX = 0;
        return countX;
    }

    public static int checkZN(int countZ, boolean range, boolean equals) {

        while (true) {
            if (range) {
                System.out.println(countZ);
                if (equals) {

                    countZ++;
                    if (countZ == operationsCount) {
                        printWin();
                        System.exit(1);
                    }
                } else {
                    countZ = 1;
                    break;
                }
            } else break;

        }
        return countZ;
    }

    public static void winner() {

        for (int i = 0; i < X_LENGTH; i++) {
            int countX = 0;
            int countY = 0;
            int countZ = 1;
            int countN = 1;

            for (int j = 0; j < Y_LENGTH; j++) {

                if (j + 1 < Y_LENGTH) {

                    // right check on X
                    countX = checkXY(countX, equalsX(i, j));
                    // down check on Y
                    countY = checkXY(countY, equalsY(i, j));


                }

                // diagonal

                countZ = checkZN(countZ, rangeZ(i, j, countZ), equalsZ(i, j, countZ));


//                countN = checkZN(countN, rangeN(i, j, countN), equalsN(i, j, countN));

//

//
//                while (true) {
//                    if (i + countZ < X_LENGTH && j + countZ < Y_LENGTH) {
//
//                        if (DESC[i][j] == DESC[i + countZ][j + countZ] && EMPTY_POINT != DESC[i][j]) {
//                            countZ++;
//                            if (countZ == operationsCount) {
//                                printWin();
//                                System.exit(1);
//                            }
//                        } else {
//                            countZ = 1;
//                            break;
//                        }
//                    } else break;
//
//                }
//
//
//                // diagonal second
//                while (true) {
//                    if (i + countN < X_LENGTH && j - countN > 0) {
//
//                        if (DESC[i][j] == DESC[i + countN][j - countN] && EMPTY_POINT != DESC[i][j]) {
//                            countN++;
//                            if (countN == operationsCount) {
//                                printWin();
//                                System.exit(1);
//                            }
//                        } else {
//                            countN = 1;
//                            break;
//                        }
//                    } else break;
//                }

            }
        }

    }


    public static void printWin() {
        System.out.println("Finish game");
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