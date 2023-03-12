package org.example.task1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class BoxNumbers<T extends Number> {
    private T[] object;

    public BoxNumbers(T... object) {
        this.object = object;
    }

    public Double average() {
        double sum = 0;
        for (T item : object) {
            sum += item.doubleValue();
        }
        return sum / object.length;
    }

    public boolean compareAverage(BoxNumbers<?> obj){
        return Math.abs(this.average()-obj.average()) < 0.001;
    }

    public T[] getObject() {
        return object;
    }

    public void setObject(T[] object) {
        this.object = object;
    }
}
