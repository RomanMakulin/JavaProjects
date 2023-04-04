package org.example.example.Controller;

import org.example.example.Controller.AddAthelets.AddMenuAthletes;
import org.example.example.Controller.AddBarriers.AddMenuBarriers;
import org.example.example.Controller.Contests.ContestLogic;
import org.example.example.Model.Athletes.Athletes;
import org.example.example.Model.Barrier.Barriers;
import org.example.example.View.ShowList;
import java.util.List;

public class Controller {
    public void buttonStart(){
        List<Athletes> athletes = new AddMenuAthletes().add();
        List<Barriers> barriers = new AddMenuBarriers().add();

        new ShowList().print(athletes);
        new ShowList().print(barriers);

        new ContestLogic().contest(athletes, barriers);
    }
}
