package org.example;

public class Main {
    public static void main(String[] args) {
        DB db = new DB();
        db.newUser("Roman", "Makulin", 25, new Address("1 may", "Moscow"));
        db.newUser("Olga", "Makulina", 55, new Address("1 may", "Moscow"));
    }
}