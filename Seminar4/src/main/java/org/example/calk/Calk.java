package org.example.calk;

import java.util.List;

public class Calk{
    public Double sum (List<? extends Number> item){
        double sum = 0;
        for (var i: item) {
            sum += i.doubleValue();
        }
        return sum;
    }
}
