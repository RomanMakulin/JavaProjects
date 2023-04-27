package org.example.Model;

import org.example.Controller.FilesWork.Config.PathRead;
import org.example.Controller.FilesWork.ReadFile;
import org.example.Controller.MenuActions;
import org.example.Model.Toy;

import java.util.ArrayList;
import java.util.List;

public class DrawRun {
    private List<Toy> toyList;
    private List<Toy> myItems;

    public DrawRun() {
        this.toyList = new ReadFile().read(new PathRead().cfg());
        this.myItems = new ArrayList<>();
    }
    public void start(){
        new MenuActions().menu(toyList, myItems);
    }
}
