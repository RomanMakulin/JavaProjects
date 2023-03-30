package org.example.example.Model.Actions;

import org.example.example.Model.Athletes.Athletes;
import org.example.example.Model.Interfaces.Actions;

public class Jump implements Actions {
    @Override
    public void action(Athletes athletes) {
        System.out.printf("[%s] %s: прыгает ...", athletes.getType(), athletes.getName());
    }
}
