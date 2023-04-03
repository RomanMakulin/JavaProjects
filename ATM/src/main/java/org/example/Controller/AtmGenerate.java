package org.example.Controller;

import org.example.Model.ATM;
import org.example.Model.Interfaces.AtmService;

import java.util.ArrayList;
import java.util.List;

public class AtmGenerate implements AtmService {
    @Override
    public void service(List<ATM> atmList) {
        int atmCount = 5;
        for (int i = 0; i < atmCount; i++) {
            atmList.add(new ATM());
        }
    }
}
