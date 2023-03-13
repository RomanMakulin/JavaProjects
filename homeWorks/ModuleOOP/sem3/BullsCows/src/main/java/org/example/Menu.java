package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    ArrayList<String> history = new ArrayList<>();

    public void gameInit() {
        showMenu();
        Scanner in = new Scanner(System.in);
        Game game = gameMod(null, in);
        game.start(2, 5);
        logicGame(game, in);
        System.out.println("Результат игры: " + game.getGameStatus());
        history(in);
    }

    public void logicGame(Game game, Scanner in) {
        while (game.getGameStatus().equals(GameStatus.START)) {
            System.out.println("Ваш ход (угадайте значение): ");
            String answer = in.next();
            history.add(answer);
            Answer answerGame = game.inputAnswer(answer);
            System.out.println(String.format("Найдено %d коров и %d быков.\nОсталось попыток: %d",
                    answerGame.getCows(), answerGame.getBulls(), AbstractGame.maxTry - AbstractGame.countTry));
        }
    }

    public void history(Scanner in) {
        System.out.println("Показать историю ходов? Введите y - если да, n - если нет:");
        String answer = in.next();
        switch (answer) {
            case "y": System.out.println("История угадывания: " + history.toString()); break;
            case "n": System.out.println("Игра окончена."); break;
            default: System.out.println("Введено неверное значение!");
        }
    }

    public void showMenu() {
        System.out.println("Меню игры BullsCows:\n1 - игра с загадыванием чисел\n2 - игра с загадыванием слов (ENG version)" +
                "\n3 - игра с загадыванием слов (RU версия)\nВыберите номер действия (режима игры): ");
    }

    public Game gameMod(Game game, Scanner in) {
        int num = in.nextInt();
        switch (num) {
            case 1: game = new NumberGame(); break;
            case 2: game = new EngWordGame(); break;
            case 3: game = new RuWordGame(); break;
            default: System.out.println("Такой игры еще не существует!");
        }
        return game;
    }

}