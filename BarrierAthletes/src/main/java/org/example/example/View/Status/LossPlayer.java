package org.example.example.View.Status;

import org.example.example.Model.Interfaces.Actions;
import org.example.example.Model.Status;
import org.example.example.Model.Athletes.Athletes;

public class LossPlayer implements Actions {
    @Override
    public void action(Athletes athletes) {
        System.out.println(athletes.getName() + " выбывает!");
        athletes.setStat(Status.LOSE);
    }
}
