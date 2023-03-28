package org.example.ActionsCalk.Model.Logger.ActionsLogg;

import org.example.ActionsCalk.Model.Action;
import org.example.ActionsCalk.Model.Logger.LoggerImpl;
import java.io.IOException;

public class MinLog implements Action {
    @Override
    public int action(int arg1, int arg2) throws IOException {
        new LoggerImpl().loggerOut(arg1, arg2);
        return arg1 - arg2;
    }
}
