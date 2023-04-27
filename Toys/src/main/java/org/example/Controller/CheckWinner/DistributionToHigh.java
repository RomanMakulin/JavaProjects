package org.example.Controller.CheckWinner;

import org.example.Model.Interfaces.Distribution;
import org.example.Model.Toy;

import java.util.List;
import java.util.Random;

public class DistributionToHigh implements Distribution {
    @Override
    public void rare(List<Toy> toyList, List<Toy> rate, List<Toy> myList) {
        int count = 2;
        while (count > 0) {
            int index = new Random().nextInt(toyList.size());
            if (toyList.get(index).getWidth() > 30) {
                rate.add(toyList.get(index));
                myList.add(toyList.get(index));
                toyList.remove(index);
                count--;
            }
        }
    }
}
