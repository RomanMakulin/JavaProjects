package org.example.work4.Controller;

import org.example.work4.Controller.Filter.FilderID;
import org.example.work4.Controller.Filter.FilterName;
import org.example.work4.Controller.Filter.FilterStage;
import org.example.work4.Model.Worker;
import org.example.work4.Model.Workers;
import org.example.work4.View.MenuView;
import org.example.work4.View.PrintWorkers;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    List<Worker> findWorker;
    List<String> findWorkerNum;
    public void btnCLick(){
        Workers workers = new Workers();

        boolean exit = false;

        while (exit == false){
            switch (new MenuView().switchMenu()) {
                case "1" -> {
                    new NewWorker().newWorker(workers.getWorkerList());
                    new PrintWorkers().show(workers.getWorkerList());
                }
                case "2" -> {
                    findWorker = new FilterStage().filter(workers.getWorkerList());
                    new PrintWorkers().show(findWorker);
                }
                case "3" -> {
                    findWorkerNum = new FilterName().filter(workers.getWorkerList());
                    new PrintWorkers().showNums(findWorkerNum);
                }
                case "4" -> System.out.println(new FilderID().findById(workers.getWorkerList()));
                case "5" -> new PrintWorkers().show(workers.getWorkerList());
                case "6" -> exit = true;
            }
        }



    }
}
