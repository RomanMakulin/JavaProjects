package org.example.work4.Controller.Filter;

import org.example.work4.Model.Worker;
import org.example.work4.View.InputName;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilterName {
    public List<String> filter(List<Worker> workerList) {
        String nameFind = new InputName().inputDate();
        List<String> findWorkers = new ArrayList<>();

        for (Worker worker : workerList) {
            if (worker.getName().equals(nameFind)) {
                findWorkers.add(worker.getPhoneNumber());
            }
        }
        return findWorkers;
    }
}
