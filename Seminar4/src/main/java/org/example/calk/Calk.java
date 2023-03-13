package org.example.calk;

import java.util.List;

public class Calk {
    public Double sum(List<? extends Number> item) {
        double sum = 0;
        for (var i : item) {
            sum += i.doubleValue();
        }
        return sum;
    }

    public Double mult(List<? extends Number> item) {
        double mult = 1;
        for (var i : item) {
            mult *= i.doubleValue();
        }
        return mult;
    }

    public Double division(List<? extends Number> item) {
        int index = 1;
        double res = item.get(0).doubleValue();
        while (item.size() > index) {
            res = res / item.get(index).doubleValue();
            index++;
        }
        return res;
    }
}
