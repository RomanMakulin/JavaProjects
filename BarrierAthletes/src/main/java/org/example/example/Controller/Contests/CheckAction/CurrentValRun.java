package org.example.example.Controller.Contests.CheckAction;

import org.example.example.Model.Athletes.Athletes;
import org.example.example.Model.Barrier.Barriers;
import org.example.example.Model.Interfaces.ContestCheck;
import org.example.example.View.Status.RunStatus;
import java.util.List;

public class CurrentValRun implements ContestCheck {
    @Override
    public void service(Athletes athletes, Barriers barriers, List<Athletes> athletesList) {
        int tmp = athletes.getMaxRunDistance();
        tmp -= barriers.getValueBarrier();
        athletes.setMaxRunDistance(tmp);
        new RunStatus().action(athletes);
    }
}