package org.example.example.verison1;

public class Game {
    private String world;
    private int maxTry;

    public Game(String world, int maxTry) {
        this.world = world;
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
