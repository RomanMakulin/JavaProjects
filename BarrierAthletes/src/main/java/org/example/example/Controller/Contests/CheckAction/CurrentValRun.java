package org.example.example.Controller.Contests.CheckAction;

import org.example.example.Model.Athletes.Athletes;
import org.example.example.Model.Barrier.Barriers;

import java.util.List;

public class CurrentValRun implements Check {
    @Override
    public void service(Athletes athletes, Barriers barriers, List<Athletes> athletesList) {
        int tmp = athletes.getMaxRunDistance();
        tmp -= barriers.getValueBarrier();
        athletes.setMaxRunDistance(tmp);
        System.out.println("Остались силы пробежать ещё " + athletes.getMaxRunDistance() + " м.");
    }
}
