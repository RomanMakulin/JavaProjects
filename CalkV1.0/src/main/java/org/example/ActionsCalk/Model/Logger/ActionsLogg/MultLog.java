package org.example.ActionsCalk.Model.Logger.ActionsLogg;

import org.example.ActionsCalk.Model.Action;
import org.example.ActionsCalk.Model.Logger.LoggerImpl;

public class MultLog implements Action {
    @Override
    public int action(int arg1, int arg2){
        new LoggerImpl().loggerOut(arg1, arg2);
        return arg1 * arg2;
    }
}
