package org.example.Model;

import org.example.View.InputWorld;

public class Answer {
    private int bulls;
    private int cows;
    private String userInput;

    public Answer() {
        this.bulls = 0;
        this.cows = 0;
        this.userInput = new InputWorld().input();
    }

    public int getBulls() {
        return bulls;
    }

    public void setBulls(int bulls) {
        this.bulls = bulls;
    }

    public int getCows() {
        return cows;
    }

    public void setCows(int cows) {
        this.cows = cows;
    }

    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }
}
