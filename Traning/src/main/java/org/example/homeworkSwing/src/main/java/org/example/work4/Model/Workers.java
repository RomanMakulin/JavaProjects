package org.example.work4.Model;

import org.example.work4.Controller.Generate;
import org.example.work4.View.InputName;
import org.example.work4.View.InputNumber;
import org.example.work4.View.InputStage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Workers {
    protected List<Worker> workerList;

    public Workers() {
        this.workerList = new Generate().generateWorkers();
    }

    public List<Worker> getWorkerList() {
        return workerList;
    }
}
