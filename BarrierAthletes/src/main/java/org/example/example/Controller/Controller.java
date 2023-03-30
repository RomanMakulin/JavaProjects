package org.example.example.Controller;

import org.example.example.Controller.AddAthelets.AddAthelets;
import org.example.example.Controller.AddBarriers.AddBarriersImpl;
import org.example.example.Controller.Contests.StartContest;
import org.example.example.Model.Athletes.Athletes;
import org.example.example.Model.Barrier.Barriers;
import org.example.example.View.Show;

import java.util.List;

public class Controller {
    public void buttonStart(){
        List<Athletes> athletes = new AddAthelets().add();
        List<Barriers> barriers = new AddBarriersImpl().add();

        new Show().print(athletes);
        new Show().print(barriers);

        new StartContest().contest(athletes, barriers);



    }
}
