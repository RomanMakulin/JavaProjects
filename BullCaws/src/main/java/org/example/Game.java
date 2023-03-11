package org.example;

public interface Game {
    void startGame(Integer sizeWord, Integer maxTry);
    Answer inputAnswer(String value);
    GameStatus getGameStatus();

}
