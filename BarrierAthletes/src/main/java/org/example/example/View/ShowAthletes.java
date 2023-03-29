package org.example.example.View;

import org.example.example.Model.Athletes.Athletes;

import java.util.List;

public class ShowAthletes {
    public void print(List<Athletes> athletes){
        for (int i = 0; i < athletes.size(); i++) {
            System.out.println(athletes.get(i));
        }
    }
}
