package org.example.Model;

import org.example.Controller.Generate.GenerateWord;

public class Game {
    private String word;
    private int maxTry;
    private Status status;

    public Game(int maxTry) {
        this.word = new GenerateWord().word();
        this.maxTry = maxTry;
        this.status = Status.INIT;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getMaxTry() {
        return maxTry;
    }

    public void setMaxTry(int maxTry) {
        this.maxTry = maxTry;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
