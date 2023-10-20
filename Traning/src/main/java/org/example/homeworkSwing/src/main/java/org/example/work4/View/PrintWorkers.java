package org.example.work4.View;

import org.example.work4.Model.Worker;

import java.util.List;

public class PrintWorkers {
    public void show(List<Worker> workerList) {
        for (Worker el1 : workerList) {
            System.out.println(el1);
        }
    }
    public void showNums(List<String> workerList){
        for (String el1 : workerList) {
            System.out.println(el1);
        }
    }
}
