package org.example;

public class Animal {

    protected String name;
    protected int maxRunDist;
    protected int maxSwimDist;
    protected String type;
    static int count;

    public Animal(String name, int maxRunDist, int maxSwimDist, String type) {
        this.name = name;
        this.maxRunDist = maxRunDist;
        this.maxSwimDist = maxSwimDist;
        this.type = type;
        count++;
    }

    public Animal() {
    }

    public void run(int dist) {
        if (dist <= maxRunDist) {
            System.out.println(this.name + " может пробежать " + dist + " метров.");
        } else {
            System.out.println(this.name + " не может пробежать " + dist + " метров.");
        }
    }

    public void swim(int dist) {
        if (maxSwimDist == 0) {
            System.out.println(this.name + " не умеет плавать.");
        }

        if (dist <= maxRunDist) {
            System.out.println(this.name + " может проплыть " + dist + " метров.");
        } else {
            System.out.println(this.name + " не может проплыть " + dist + " метров.");
        }
    }


}
