package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Меню:");
        Scanner scanner = new Scanner(System.in);

        Game game = null;
        // выбор режима игры
        switch (scanner.nextInt()) {
            case 1:
                game = new NumGame();
                break;
//            case 2: game = new WordGame();
//            break;
            default:
                System.out.println("Такой игры ещё нет");
        }

        game.startGame(4, 10);
        game.inputAnswer(scanner.nextLine());

        System.out.println(game.getGameStatus());


    }
}