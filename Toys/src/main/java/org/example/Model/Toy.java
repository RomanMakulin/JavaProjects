package org.example.Model;

public class Toy {
    private int id;
    private static int counterId;
    private String name;
    private int width;

    public Toy(String name, int width) {
        counterId ++;
        this.id = counterId;
        this.name = name;
        this.width = width;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "id: " + id +
                ", name: " + name +
                ", width: " + width;
    }
}
