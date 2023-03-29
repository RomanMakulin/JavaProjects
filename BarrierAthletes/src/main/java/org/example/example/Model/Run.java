package org.example.example.Model;

import org.example.example.Model.Athletes.Athletes;

public class Run implements Actions{
    Athletes athletes;
    @Override
    public void action() {
        System.out.printf("[%s] %s: бежит ...", athletes.getType(), athletes.getName());
    }
}
