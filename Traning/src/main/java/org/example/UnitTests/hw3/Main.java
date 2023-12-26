package org.example.UnitTests.hw3;

public class Main {
    public static void main(String[] args) {
        // HW 3.1. Нужно покрыть тестами метод на 100%
        // Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).


//        Задание 2. Разработайте и протестируйте метод numberInInterval, который проверяет, попадает ли
//        переданное число в интервал (25;100)
//        public boolean numberInInterval(int n) { … }

//        Добавьте функцию в класс UserRepository, которая разлогинивает всех пользователей, кроме администраторов.
//        Для этого, вам потребуется расширить класс User новым свойством, указывающим, обладает ли пользователь админскими правами. Протестируйте данную функцию.

        User user = new User("Roman", "123s");
        User user2 = new User("Olga", "123s");
        User user3 = new User("Peta", "123s");
        User user4 = new User("Mila", "123s");

        UserRepository userRepository = new UserRepository();

        user.authenticate("Roman", "123s");
        user2.authenticate("Olga", "123s");
        user3.authenticate("Peta", "123s");
        user4.authenticate("Mila", "123s");

        user.isAdmin = true;

        userRepository.addUser(user);
        userRepository.addUser(user2);
        userRepository.addUser(user3);
        userRepository.addUser(user4);

        userRepository.getData().forEach(item -> System.out.println("Login: " + item.name + ", pass: " + item.password));

//        user.loginOut();
//        userRepository.delUserFromList(user);

        System.out.println("\n");
        userRepository.logOutAll();
        userRepository.getData().forEach(item -> System.out.println("Login: " + item.name + ", pass: " + item.password));
    }

    public boolean evenNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean numberInInterval(int n) {
        return n >= 25 & n <= 100;
    }

}
