package org.example.ActionsCalk.Controller;

import org.example.ActionsCalk.Model.Logger.ActionsLogg.DivLog;
import org.example.ActionsCalk.Model.Logger.ActionsLogg.MinLog;
import org.example.ActionsCalk.Model.Logger.ActionsLogg.MultLog;
import org.example.ActionsCalk.Model.Logger.ActionsLogg.SumLog;
import org.example.ActionsCalk.View.InputString;
import org.example.ActionsCalk.View.ViewResult;
import org.example.ActionsCalk.View.InputInt;;



public class Controller {
    public void startCalk() {

        int result = new InputInt().inp();

        while (true) {

            String cmd = new InputString().inp("+, -, *, /,  =");

            if (cmd.equals("+")) {
                result = new SumLog().action(result, new InputInt().inp());
                continue;
            }

            if (cmd.equals("-")) {
                result = new MinLog().action(result, new InputInt().inp());
                continue;
            }

            if (cmd.equals("*")) {
                result = new MultLog().action(result, new InputInt().inp());
                continue;
            }

            if (cmd.equals("/")) {
                result = new DivLog().action(result, new InputInt().inp());
                continue;
            }

            if (cmd.equals("=")) {
                new ViewResult().result(result);
                break;
            }
        }
    }
}
