package org.example;

import java.util.List;

public class Calk {
    public Double sum(List<? extends Number> item) {
        double sum = 0;
        for (var i : item) sum += i.doubleValue();
        return sum;
    }

    public Double mult(List<? extends Number> item) {
        double mult = 1;
        for (var i : item) mult *= i.doubleValue();
        return mult;
    }

    public Double division(List<? extends Number> item) {
        int index = 1;
        double res = item.get(0).doubleValue();
        while (item.size() > index) {
            res /= item.get(index).doubleValue();
            index++;
        }
        return res;
    }

    public <T> String binaryMethod(T obj) {
        if (obj instanceof String || obj instanceof Double) {
            int num = (int) Double.parseDouble(obj.toString());
            return Integer.toBinaryString(num);
        } else return Integer.toBinaryString(Integer.parseInt(obj.toString()));
    }

}