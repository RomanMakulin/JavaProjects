package org.example.example;

public class Athletes implements Move {

    protected String name;
    protected int maxRunDistance;
    protected int maxJumpHight;
    protected String type;
    static int athletesCount;


    public Athletes(String name, int maxRunDistance, int maxJumpHight, String type) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHight = maxJumpHight;
        this.type = type;
        athletesCount++;
    }

    // Получение информации о спортсмене
    public String getInfo(){
        return String.format("Name: %s, maxDist: %d, maxJumpHight: %d, Type: %s", name, maxRunDistance, maxJumpHight, type);
    }

    @Override
    public void run() {
        System.out.printf("%s бежит дальше ...", name);
    }

    @Override
    public void jump() {
        System.out.printf("%s перепрыгнул ...", name);
    }
}
