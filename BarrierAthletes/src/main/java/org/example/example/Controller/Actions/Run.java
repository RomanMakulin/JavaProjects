package org.example.example.Controller.Actions;

import org.example.example.Model.Athletes.Athletes;
import org.example.example.Model.Interfaces.Actions;
import org.example.example.View.Actions.PrintRun;

public class Run implements Actions {
    @Override
    public void action(Athletes athletes) {
        new PrintRun().action(athletes);
    }
}
