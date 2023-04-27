package org.example.Controller.CheckWinner;

import org.example.Model.Toy;

import java.util.List;

public class Distribution {
    public void service(List<Toy> toyList, List<Toy> low, List<Toy> high, List<Toy> myList) {

        new DistributionToHigh().rare(toyList, high, myList);
        new DistributionToLow().rare(toyList, low, myList);

    }
}
