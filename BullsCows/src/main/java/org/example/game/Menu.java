package org.example.game;

import java.util.Scanner;

public class Menu {

    public void gameInit() {
        showMenu();
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        Game game = gameMod(num, null);
        game.start(2, 5);
        mainLogic(game, in);
    }

    public void mainLogic(Game game, Scanner in){
        while (game.getGameStatus().equals(GameStatus.START)) {
            System.out.println("Ваш ход (угадайте значение): ");
            String answer = in.next();
            Answer answerGame = game.inputAnswer(answer);
            System.out.println(String.format("Найдено %d коров и %d быков.\nОсталось попыток: %d",
                    answerGame.getCows(), answerGame.getBulls(), AbstractGame.maxTry - AbstractGame.countTry));
        }
        System.out.println(game.getGameStatus());
    }

    public void showMenu() {
        System.out.println("Меню игры BullsCows:\n1 - игра с загадыванием чисел\n2 - игра с загадыванием слов (ENG version)" +
                "\n3 - игра с загадыванием слов (RU версия)\nВыберите номер действия (режима игры): ");
    }

    public Game gameMod(int num, Game game) {
        switch (num) {
            case 1:
                game = new NumberGame();
                break;
            case 2:
                game = new EngWordGame();
                break;
            case 3:
                game = new RuWordGame();
                break;
            default:
                System.out.println("Такой игры еще не существует!");
        }
        return game;
    }

}
