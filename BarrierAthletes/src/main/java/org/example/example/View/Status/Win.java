package org.example.example.View.Status;

import org.example.example.Model.Status;
import org.example.example.Model.Athletes.Athletes;
import org.example.example.Model.Interfaces.Actions;

public class Win implements Actions {
    @Override
    public void action(Athletes athletes) {
        if (athletes.getStat() != Status.LOSE)
            System.out.println(athletes.getName() + " победитель!");
    }
}
