package org.example;

public class Athletes{

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

    public void run() {
        System.out.println(String.format("[%s] %s пробегает ...", type, name));
    }

    public void jump() {
        System.out.println(String.format("[%s] %s перепрыгивает ...", type, name));
    }


}
