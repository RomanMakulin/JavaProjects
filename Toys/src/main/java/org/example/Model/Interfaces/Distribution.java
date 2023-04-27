package org.example.Model.Interfaces;

import org.example.Model.Toy;

import java.util.List;

public interface Distribution {
    public void rare(List<Toy> toyList, List<Toy> rate, List<Toy> myList);
}
