package org.example.example.verison1;

import org.example.example.verison1.Answer;

public class InputAnswer {
    public Answer inputAnswer(String word, String value) {
        int bull = 0;
        int cow = 0;
        for (int i = 0; i < value.length(); i++) {
            if (word.contains(Character.toString(value.charAt(i)))) cow++;
            if (word.charAt(i) == value.charAt(i)) bull++;
        }

        return new Answer(cow, bull, value);
    }
}
