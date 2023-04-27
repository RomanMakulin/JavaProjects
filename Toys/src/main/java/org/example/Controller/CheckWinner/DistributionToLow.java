package org.example.Controller.CheckWinner;

import org.example.Model.Interfaces.Distribution;
import org.example.Model.Toy;

import java.util.List;
import java.util.Random;

public class DistributionToLow implements Distribution {
    @Override
    public void rare(List<Toy> toyList, List<Toy> rate, List<Toy> myList) {
        while (true) {
            int index = new Random().nextInt(toyList.size());
            if (toyList.get(index).getWidth() < 30) {
                rate.add(toyList.get(index));
                myList.add(toyList.get(index));
                toyList.remove(index);
                break;
            } else break;
        }
    }
}
