package org.example.example.View.Actions;

import org.example.example.Model.Athletes.Athletes;
import org.example.example.Model.Interfaces.Actions;

public class PrintRun implements Actions {
    @Override
    public void action(Athletes athletes) {
        System.out.printf("[%s] %s: бежит ...", athletes.getType(), athletes.getName());
    }
}
