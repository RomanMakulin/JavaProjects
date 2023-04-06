package org.example.example.verison1;

public class Game {
    private String world;
    private int maxTry;

    public Game(int maxTry) {
        this.world = new GenerateWorld().generateWord();
        this.maxTry = maxTry;
    }

    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }

    public int getMaxTry() {
        return maxTry;
    }

    public void setMaxTry(int maxTry) {
        this.maxTry = maxTry;
    }
}
