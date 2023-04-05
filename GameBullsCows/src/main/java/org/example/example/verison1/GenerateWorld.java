package org.example.example.verison1;

import org.example.example.verison1.GameMode.EngGame;
import org.example.example.verison1.GameMode.InputInt.InputSizeWorld;
import org.example.example.verison1.GameMode.NumberGame;
import org.example.example.verison1.GameMode.RuGame;

import java.security.SecureRandom;
import java.util.List;
import java.util.Scanner;

public class GenerateWorld {
    List<String> charList;
    private String generateWord() {
        System.out.println("1 - Ru game\n2 - Eng game\n3 - Numbers game");
        switch (new Scanner(System.in).nextInt()){
            case 1:
                charList = new RuGame().generateCharList();
                break;
            case 2:
                charList = new EngGame().generateCharList();
                break;
            case 3:
                charList = new NumberGame().generateCharList();
                break;
        }
        SecureRandom random = new SecureRandom();
        String res = "";

        int sizeWord = new InputSizeWorld().print();
        for (int i = 0; i < sizeWord; i++) {
            int randomeIndex = random.nextInt(charList.size());
            res += charList.get(randomeIndex);
            charList.remove(randomeIndex);
        }
        return res;
    }
}
