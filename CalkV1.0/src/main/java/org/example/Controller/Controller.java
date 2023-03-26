package org.example.Controller;

import org.example.Model.Calk;
import org.example.Model.Logger.CalkLogImpl;
import org.example.View.InputAction;
import org.example.View.InputInt;
import org.example.View.ViewResult;

public class Controller {
    public void startCalk() {

        Calk arg = new CalkLogImpl(new InputInt().input());

        while (true) {

            String cmd = new InputAction().input();

            if (cmd.equals("+")) {
                arg.sum(new InputInt().input());
                continue;
            }

            if (cmd.equals("-")) {
                arg.minus(new InputInt().input());
                continue;
            }

            if (cmd.equals("*")) {
                arg.milti(new InputInt().input());
                continue;
            }

            if (cmd.equals("/")) {
                arg.div(new InputInt().input());
                continue;
            }

            if (cmd.equals("=")) {
                new ViewResult().result(arg.result());
                break;
            }

        }
    }
}
