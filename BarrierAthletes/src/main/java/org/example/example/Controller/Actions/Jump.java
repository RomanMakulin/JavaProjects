package org.example.example.Controller.Actions;

import org.example.example.Model.Athletes.Athletes;
import org.example.example.Model.Interfaces.Actions;
import org.example.example.View.Actions.PrintJump;

public class Jump implements Actions {
    @Override
    public void action(Athletes athletes) {
        new PrintJump().action(athletes);
    }
}
