package org.example.example.Controller.Contests.CheckAction;

import org.example.example.Model.Athletes.Athletes;
import org.example.example.Model.Barrier.Barriers;

import java.util.List;

public interface Check {
    void service(Athletes athletes, Barriers barriers, List<Athletes> athletesList);
}
