package org.example.Controller.Generate;

import org.example.Model.ATM;
import org.example.Model.Interfaces.GenerateService;

import java.util.ArrayList;
import java.util.List;

public class AtmGenerate<T> implements GenerateService {
    @Override
    public List<?> service() {
        List<ATM> atmList = new ArrayList<>();
        int atmCount = 5;
        for (int i = 0; i < atmCount; i++) {
            atmList.add(new ATM());
        }
        return atmList;
    }
}
