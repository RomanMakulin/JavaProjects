package org.example.work4.Controller.Filter;

import org.example.work4.Model.Worker;
import org.example.work4.View.InputStage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilterStage {
    public List<Worker> filter(List<Worker> workerList) {
        int stageFind = new InputStage().inputDate();
        List<Worker> findWorkers = new ArrayList<>();

        for (Worker worker : workerList) {
            if (worker.getStage() == stageFind) {
                findWorkers.add(worker);
            }
        }
        return findWorkers;
    }
}
