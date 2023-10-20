package org.example.work4.Controller;

import org.example.work4.Model.Worker;
import org.example.work4.Model.Workers;
import org.example.work4.View.InputName;
import org.example.work4.View.InputNumber;
import org.example.work4.View.InputStage;

import java.util.List;

public class NewWorker {
    public void newWorker(List<Worker> workerList) {
        workerList.add(new Worker(
                new InputNumber().inputDate(),
                new InputName().inputDate(),
                new InputStage().inputDate()));
    }
}
