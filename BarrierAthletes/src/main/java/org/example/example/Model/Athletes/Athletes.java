package org.example.example.Model.Athletes;

public abstract class Athletes {
    private String name;
    private int maxRunDistance;
    private int maxJumpHight;
    private String type;
    static int athletesCount;

    public Athletes(String name, int maxRunDistance, int maxJumpHight, String type) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHight = maxJumpHight;
        this.type = type;
        athletesCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public void setMaxRunDistance(int maxRunDistance) {
        this.maxRunDistance = maxRunDistance;
    }

    public int getMaxJumpHight() {
        return maxJumpHight;
    }

    public void setMaxJumpHight(int maxJumpHight) {
        this.maxJumpHight = maxJumpHight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return  "name: " + name +
                ", maxRunDistance: " + maxRunDistance +
                ", maxJumpHight: " + maxJumpHight +
                ", type: " + type;
    }
}
