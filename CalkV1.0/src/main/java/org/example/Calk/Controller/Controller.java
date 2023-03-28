package org.example.Calk.Controller;

import org.example.Calk.Model.Calk.Calk;
import org.example.Calk.Model.Logger.CalkLogImpl;
import org.example.Calk.View.InputAction;
import org.example.Calk.View.InputInt;
import org.example.Calk.View.ViewResult;

import java.io.IOException;

public class Controller {
    public void startCalk() throws IOException {

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
