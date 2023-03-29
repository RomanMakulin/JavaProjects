package org.example.example.Model;

import org.example.example.Model.Athletes.Athletes;

public class Jump implements Actions{
    Athletes athletes;
    @Override
    public void action() {
        System.out.printf("[%s] %s: прыгает ...", athletes.getType(), athletes.getName());
    }
}
