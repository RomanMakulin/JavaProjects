package org.example.example.Controller;

import org.example.example.Barrier;
import org.example.example.Controller.CreateAthelets.AtheletsAdd;
import org.example.example.Controller.CreateAthelets.BotAdd;
import org.example.example.Controller.CreateAthelets.CatAdd;
import org.example.example.Controller.CreateAthelets.HumanAdd;
import org.example.example.Model.Athletes.Athletes;
import org.example.example.Model.Athletes.Bot;
import org.example.example.Model.Athletes.Human;
import org.example.example.View.CreateAtheletsMenu;
import org.example.example.View.InputInt;
import org.example.example.View.InputStr;
import org.example.example.View.ShowAthletes;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public void buttonStart(){
        List<Athletes> athletes = new ArrayList<>();
        List<Barrier> barriers = new ArrayList<>();

        new AtheletsAdd().add(athletes);
        new ShowAthletes().print(athletes);


    }
}
