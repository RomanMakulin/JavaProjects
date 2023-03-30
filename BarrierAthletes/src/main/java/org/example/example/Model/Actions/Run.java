package org.example.example.Model.Actions;

import org.example.example.Model.Athletes.Athletes;
import org.example.example.Model.Interfaces.Actions;

public class Run implements Actions {
    @Override
    public void action(Athletes athletes) {
        System.out.printf("[%s] %s: бежит ...", athletes.getType(), athletes.getName());
    }
}
