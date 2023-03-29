package org.example.example.Model.Actions;

import org.example.example.Model.Athletes.Athletes;
import org.example.example.Model.Interfaces.Actions;

public class Run implements Actions {
    Athletes athletes;
    @Override
    public void action() {
        System.out.printf("[%s] %s: бежит ...", athletes.getType(), athletes.getName());
    }
}
