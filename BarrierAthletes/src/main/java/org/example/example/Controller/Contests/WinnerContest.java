package org.example.example.Controller.Contests;

import org.example.example.Model.Athletes.Athletes;
import org.example.example.Model.Barrier.Barriers;

import java.util.List;

public class WinnerContest implements Contest {
    @Override
    public void contest(List<Athletes> athletes, List<Barriers> barriers) {
        for (int i = 0; i < athletes.size(); i++) {
            if (athletes.get(i) != null) {
                System.out.println(athletes.get(i).getName() + " победитель!");
            }
        }
    }
}
