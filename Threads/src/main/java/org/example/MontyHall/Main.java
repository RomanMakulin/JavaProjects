package org.example.MontyHall;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int wins = 0;
        int loses = 0;

        for (int i = 0; i < 1000; i++) {
            int choice = 0;
            HashMap<Integer, Boolean> gameNew = new HashMap<>();
            HashMap<Integer, String> result = new HashMap<>();
            gameNew.put(0, false);
            gameNew.put(1, true);
            gameNew.put(2, false);

            showChoice(gameNew);
            choice = inputChoice(gameNew);
            gameNew.remove(deleteChoiceIndex(gameNew, choice)); // удаляем один вариант и повышаем шанс
            showChoice(gameNew);
            choice = inputChoice(gameNew);

            if (checkWin(gameNew, choice)){
                wins++;
                result.put(i, "Win");
            }else {
                loses++;
                result.put(i, "Lose");
            }
            System.out.println(result.get(i));
            System.out.println();
        }

        System.out.printf("Побед: %d, Проигрышей: %d", wins, loses);


    }
    public static boolean checkWin(HashMap<Integer, Boolean> gameNew, int choice){
        return gameNew.get(choice);
    }

    public static void showChoice(HashMap<Integer, Boolean> gameNew){
        System.out.print("Выберите комнату с призом: ");
        System.out.print(gameNew.keySet());
    }
    public static int inputChoice(HashMap<Integer, Boolean> gameNew){
        System.out.println();
        Object[] arr = gameNew.keySet().toArray();
        return (int) arr[new Random().nextInt(arr.length)];
    }

    public static int deleteChoiceIndex(HashMap<Integer, Boolean> gameNew, int userChoiceIndex){
        while (true) {
            int botChoiceIndex = new Random().nextInt(gameNew.size()); // удаляем - повышаем шанс
            if (userChoiceIndex != botChoiceIndex && !gameNew.get(botChoiceIndex)){
                return botChoiceIndex;
            }
        }
    }

}
