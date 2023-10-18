package org.example.work4;

import org.example.work4.Model.Workers;

public class Progr {
    public static void main(String[] args) {

        Workers workers = new Workers();

        workers.printWorkers();
//        workers.findByStage();
//        workers.findPhoneByName();
//        workers.findById();
        workers.newWorker();
        workers.printWorkers();
    }
}
