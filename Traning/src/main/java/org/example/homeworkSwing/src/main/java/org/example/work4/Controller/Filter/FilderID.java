package org.example.work4.Controller.Filter;

import org.example.work4.Model.Worker;
import org.example.work4.Model.Workers;
import org.example.work4.View.InputId;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class FilderID {
    public Worker findById(List<Worker> workerList) {
        int idFind = new InputId().input();
        return workerList.stream().filter(worker -> idFind == worker.getId()).findAny().get();
    }
}
