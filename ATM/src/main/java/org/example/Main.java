package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        User user = new User("roma", 123, 0, 1000);

        System.out.println("Вход в систему: ");

        System.out.print("Введите логин: ");
        String login = new Scanner(System.in).nextLine();

        System.out.println("Введите пин: ");
        int pin = new Scanner(System.in).nextInt();

        if (user.getLogin().equals(login) && user.getPin() == pin) {

            boolean next = true;
            while (next) {
                String cmd = new Scanner(System.in).nextLine();
                System.out.println("Успешный вход в систему!\n" +
                        "Выберите действие:\n" +
                        "1 - снять деньги со счета\n" +
                        "2 - положить деньги на счет\n" +
                        "3 - изменить пин-код\n" +
                        "4 - показать состояние банкомата*\n" +
                        "5 - показать доступные средства" +
                        "6 - показать информацию о пользователе" +
                        "7 - завершить работу");
                switch (cmd) {

                    case "1":
                        System.out.println("Введите сумму для снятия: ");
                        int decrease = new Scanner(System.in).nextInt();
                        if (user.getMoney() > decrease) {
                            user.setMoney(user.getMoney() - decrease);
                            user.setCash(user.getCash() + decrease);
                        } else System.out.println("Недостаточно средств для снятия!");
                        break;

                    case "2":
                        System.out.println("Введите сумму для пополнения: ");
                        int increase = new Scanner(System.in).nextInt();
                        if (user.getCash() > increase) {
                            user.setMoney(user.getMoney() + increase);
                            user.setCash(user.getCash() - increase);
                        } else System.out.println("Недостаточно средств для пополнения!");
                        break;

                    case "3":
                        System.out.println("Введите пин-код: ");
                        int tryPin = new Scanner(System.in).nextInt();
                        if (tryPin == user.getPin()) user.setPin(new Scanner(System.in).nextInt());
                        break;

                    case "4":
                        break;

                    case "5":
                        System.out.printf("Денюшки: %d", user.getMoney());

                    case "6":
                        System.out.println("Введите пин-код: ");
                        if (new Scanner(System.in).nextInt() == user.getPin()){
                            System.out.println(user);
                        }else System.out.println("Ошибка ввода pin");
                        break;

                    case "7":
                        System.out.println("Bye");
                        System.exit(1);
                        break;
                }
            }


        }


    }
}