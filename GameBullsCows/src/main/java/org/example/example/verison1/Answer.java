package org.example.example.verison1;

public class Answer {
    private int cows;
    private int bulls;
    private String userInput;

    public Answer(int cows, int bulls, String userInput) {
        this.cows = cows;
        this.bulls = bulls;
        this.userInput = userInput;
    }

    public int getCows() {
        return cows;
    }

    public void setCows(int cows) {
        this.cows = cows;
    }

    public int getBulls() {
        return bulls;
    }

    public void setBulls(int bulls) {
        this.bulls = bulls;
    }

    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }
}
