package org.example.Controller.CheckWinner;

import org.example.Model.Toy;

import java.util.List;
import java.util.Random;


public class Distribution {
    public void service(List<Toy> toyList, List<Toy> low, List<Toy> high, List<Toy> myList) {
        Random random = new Random();

        int count = toyList.size() / 2;
        while (count > 0) {
            int index = random.nextInt(toyList.size());
            if (toyList.get(index).getWidth() > 30) {
                high.add(toyList.get(index));
                myList.add(toyList.get(index));
                toyList.remove(index);
                count--;
            }
        }

        while (true) {
            int index = random.nextInt(toyList.size());
            if (toyList.get(index).getWidth() < 30) {
                low.add(toyList.get(index));
                myList.add(toyList.get(index));
                toyList.remove(index);
                break;
            } else break;
        }


    }
}
