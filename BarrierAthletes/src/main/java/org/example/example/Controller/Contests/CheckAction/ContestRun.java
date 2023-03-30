package org.example.example.Controller.Contests.CheckAction;

import org.example.example.Model.Actions.Run;
import org.example.example.Model.Athletes.Athletes;
import org.example.example.Model.Barrier.Barriers;
import org.example.example.Model.Interfaces.ContestCheck;
import org.example.example.View.Status.LossPlayer;

import java.util.List;

public class ContestRun implements ContestCheck {
    @Override
    public void service(Athletes athletes, Barriers barriers, List<Athletes> players) {
        if (athletes.getMaxRunDistance() >= barriers.getValueBarrier()) {
            new Run().action(athletes);
            new CurrentValRun().service(athletes, barriers, players);
        } else {
            new LossPlayer().action(athletes);
        }
    }
}
