package org.example;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.SecureRandom;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public abstract class AbstractGame implements Game {
    Integer sizeWord;
    String word;
    Integer maxTry;
    static int countTry;
    GameStatus status = GameStatus.OFF;

    @Override
    public GameStatus getGameStatus() {
        return status;
    }

    private String generateWord() {
        List<String> charList = generateCharList();
        SecureRandom random = new SecureRandom();
        String res = "";
        int index;
        for (int i = 0; i < sizeWord; i++) {
            index = random.nextInt(charList.size());
            res += charList.get(index);
        }
        return res;
    }

    @Override
    public void startGame(Integer sizeWord, Integer maxTry) {
        this.sizeWord = sizeWord;
        this.maxTry = maxTry;
        word = generateWord();
        this.status = GameStatus.START;
    }

    @Override
    public Answer inputAnswer(String value) {
        int bull = 0;
        int caw = 0;

        for (int i = 0; i < value.length(); i++) {
            String str2 = Character.toString(value.charAt(i));

            if (word.contains(str2)) caw++;
            if (word.charAt(i) == value.charAt(i)) bull++;
        }
        countTry++;

        if (countTry > maxTry) this.status = GameStatus.LOOSE;
        if (bull == sizeWord) this.status = GameStatus.WIN;

        Answer answer = new Answer(caw, bull, value);
        return answer;
    }

    abstract List<String> generateCharList();

}