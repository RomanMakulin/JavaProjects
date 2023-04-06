package org.example.View;

import org.example.Model.Answer;

public class BullsCows{
    public void print(Answer answer) {
        System.out.printf("Bulls: %d, cows: %d\n", answer.getBulls(), answer.getCows() );
    }
}
