package org.example.work4.Controller;

import org.example.work4.Model.Worker;

import java.util.ArrayList;
import java.util.List;

public class Generate {
    public List<Worker> generateWorkers() {
        List<Worker> workerList = new ArrayList<>();
        workerList.add(new Worker("911", "Roman", 5));
        workerList.add(new Worker("534", "Olga", 1));
        workerList.add(new Worker("534213", "Olga", 2));
        workerList.add(new Worker("11", "Ivan", 2));
        workerList.add(new Worker("5464564", "Egor", 3));
        workerList.add(new Worker("4564", "Egorrr", 2));
        return workerList;
    }
}
