package org.example.work4.Model;

import org.example.work4.View.InputName;
import org.example.work4.View.InputNumber;
import org.example.work4.View.InputStage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Workers {

    List<Worker> workerList;

    public Workers() {
        this.workerList = generateWorkers();
    }

    public List<Worker> generateWorkers(){
        workerList = new ArrayList<>();
        workerList.add(new Worker("911", "Roman", 5));
        workerList.add(new Worker("534", "Olga", 1));
        workerList.add(new Worker("534213", "Olga", 2));
        workerList.add(new Worker("11", "Ivan", 2));
        workerList.add(new Worker("5464564", "Egor", 3));
        workerList.add(new Worker("4564", "Egorrr", 2));
        return workerList;
    }

    public void printWorkers(){
        for (Worker el1: workerList) {
            System.out.println(el1);
        }
    }

    //    Добавить метод добавление нового сотрудника в справочник
    public void newWorker(){
        workerList.add(new Worker(
                new InputNumber().inputDate(),
                new InputName().inputDate(),
                new InputStage().inputDate()));
    }

    //    Добавить метод, который ищет сотрудника по стажу (может быть список)
    public void findByStage(){
        System.out.print("Print stage: ");
        int stageFind = new Scanner(System.in).nextInt();
        List<Worker> findWorkers = new ArrayList<>();

        for (Worker worker : workerList) {
            if (worker.stage == stageFind) {
                findWorkers.add(worker);
            }
        }
        checkFind(findWorkers);
    }

    //    Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
    public void findPhoneByName(){
        System.out.print("Print name: ");
        String nameFind = new Scanner(System.in).next();
        List<String> findWorkers = new ArrayList<>();

        for (Worker worker : workerList) {
            if (worker.name.equals(nameFind)) {
                findWorkers.add(worker.phoneNumber);
            }
        }
        checkFind(findWorkers);
    }

    //    Добавить метод, который ищет сотрудника по табельному номеру
    public void findById(){
        System.out.print("Print ID: ");
        int idFind = new Scanner(System.in).nextInt();
        List<Worker> findWorkers = new ArrayList<>();

        for (Worker worker : workerList) {
            if (worker.id == idFind) {
                findWorkers.add(worker);
            }
        }
        checkFind(findWorkers);
    }

    public <T> void checkFind (List<T> findWorkers){
        if (findWorkers.size() > 0){
            for (T el1: findWorkers) {
                System.out.println(el1);
            }
        } else System.out.println("No one");
    }

}
