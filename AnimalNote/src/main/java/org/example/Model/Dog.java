package org.example.Model;

import java.util.List;

public class Dog extends Animal{
    public Dog(String name, List<String> commandsList) {
        super(name, commandsList, "dog");
    }
}
