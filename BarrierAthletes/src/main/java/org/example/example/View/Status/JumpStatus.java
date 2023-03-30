package org.example.example.View.Status;

import org.example.example.Model.Athletes.Athletes;
import org.example.example.Model.Interfaces.Actions;

public class JumpStatus implements Actions {
    @Override
    public void action(Athletes athletes) {
        System.out.println("Остались силы прыгнуть ещё на " + athletes.getMaxJumpHight() + " м.");
    }
}
