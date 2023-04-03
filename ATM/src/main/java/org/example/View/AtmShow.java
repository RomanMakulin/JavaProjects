package org.example.View;

import org.example.Model.ATM;
import java.util.List;

public class AtmShow {
    public void print(List<ATM> atmList){
        for (int i = 0; i < atmList.size(); i++) {
            System.out.println(atmList.get(i));
        }
        System.out.println();
    }
}
