package org.example.example.Controller.Contests;

import org.example.example.Model.Athletes.Athletes;
import org.example.example.Model.Barrier.Barriers;
import org.example.example.Model.Interfaces.Contest;
import org.example.example.Model.Status;
import org.example.example.View.Status.Win;
import java.util.List;

public class WinnerContest implements Contest {
    @Override
    public void contest(List<Athletes> athletes, List<Barriers> barriers) {
        for (int i = 0; i < athletes.size(); i++) {
            if (athletes.get(i).getStat() != Status.LOSE) {
                athletes.get(i).setStat(Status.WIN);
                new Win().action(athletes.get(i));
            }
        }
    }
}
