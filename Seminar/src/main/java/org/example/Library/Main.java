package org.example.Library;

import org.example.Library.Impl.Agrigator;

public class Main {
    public static void main(String[] args) {
        Agrigator agrigator = new Agrigator().generateBook();
        System.out.println(agrigator);
    }
}