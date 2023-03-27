package org.example.ActionsCalk.Model.ActionsImpl;

import org.example.ActionsCalk.Model.Action;

public class Div implements Action {
    @Override
    public int action(int arg1, int arg2) {
        return arg1 / arg2;
    }
}
