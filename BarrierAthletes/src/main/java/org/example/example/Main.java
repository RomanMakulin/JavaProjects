//package org.example.example;
//
//public class Main {
//    public static void main(String[] args) {
//
//        // массив атлетов
//        Athletes[] athlete = {
//                new Human("Roman", 1000, 3),
//                new Cat("Milka", 500, 3),
//                new Robot("JoJo v1.0", 3000, 10)
//        };
//
//        // массив препятствий
//        Barrier[] barriers = {
//                new Wall(2),
//                new Runroad(600),
//                new Wall(4)
//        };
//
//        System.out.println("Список спортсменов: ");
//        for (Athletes player: athlete) {
//            System.out.println(player.getInfo());
//        }
//        System.out.println();
//
//        Contest contest = new Contest(barriers, athlete);
//        contest.contestFight();
//        contest.checkWinner();
//
//    }
//}