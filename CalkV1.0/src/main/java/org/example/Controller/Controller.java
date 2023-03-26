package org.example.Controller;

import org.example.Model.Logger.LogCalk;
import org.example.View.InputAction;
import org.example.View.InputInt;
import org.example.View.ViewResult;

public class Controller {
    public void startCalk() {

        LogCalk arg = new LogCalk(new InputInt().input());
        int result = 0;

        while (true) {

            String cmd = new InputAction().input();

            if (cmd.equals("+")) {
                result = arg.sum(new InputInt().input());
                continue;
            }

            if (cmd.equals("-")) {
                result = arg.minus(new InputInt().input());
                continue;
            }

            if (cmd.equals("*")) {
                result = arg.milti(new InputInt().input());
                continue;
            }

            if (cmd.equals("/")) {
                result = arg.div(new InputInt().input());
                continue;
            }

            if (cmd.equals("=")) {
                new ViewResult().result(arg.result());
                break;
            }

        }
    }
}