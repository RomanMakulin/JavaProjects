package org.example.example.Controller.Contests;

import org.example.example.Controller.Contests.CheckAction.CheckJump;
import org.example.example.Controller.Contests.CheckAction.CheckRun;
import org.example.example.Model.Athletes.Athletes;
import org.example.example.Model.Barrier.Barriers;
import org.example.example.Model.Barrier.Runroad;
import org.example.example.Model.Interfaces.Contest;
import org.example.example.Model.Status;

import java.util.List;

public class StartContest implements Contest {
    @Override
    public void contest(List<Athletes> athletes, List<Barriers> barriers) {
        for (int i = 0; i < barriers.size(); i++) {
            for (int j = 0; j < athletes.size(); j++) {
                if (barriers.get(i) instanceof Runroad && athletes.get(j).getStat() != Status.LOSE) {
                    new CheckRun().service(athletes.get(j), barriers.get(i), athletes);
                } else if (athletes.get(j).getStat() != Status.LOSE) {
                    new CheckJump().service(athletes.get(j), barriers.get(i), athletes);
                }
            }
            System.out.println();
        }
        new WinnerContest().contest(athletes, barriers);
    }
}
