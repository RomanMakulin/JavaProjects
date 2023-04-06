package org.example.example.verison1;

public class Main {
    public static void main(String[] args) {
        Game game = new Game(3);
        System.out.println(game.getWorld());
        Answer answer = new InputAnswer().inputAnswer(game.getWorld(), "test");

        int maxTry = 5;
        int countTry = 0;

        while (countTry < maxTry){
            new InputAnswer().inputAnswer(game.getWorld(), "test");
            new InputAnswer().inputAnswer(game.getWorld(), "test");
        }

        System.out.println(answer.getBulls() + answer.getCows());
    }
}
