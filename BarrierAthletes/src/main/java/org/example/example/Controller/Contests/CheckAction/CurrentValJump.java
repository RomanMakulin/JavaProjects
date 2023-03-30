package org.example.example.Controller.Contests.CheckAction;

import org.example.example.Model.Athletes.Athletes;
import org.example.example.Model.Barrier.Barriers;
import org.example.example.Model.Interfaces.Check;
import org.example.example.View.Status.JumpStatus;
import java.util.List;

public class CurrentValJump implements Check {
    @Override
    public void service(Athletes athletes, Barriers barriers, List<Athletes> players) {
        int tmp = athletes.getMaxJumpHight();
        tmp -= barriers.getValueBarrier();
        athletes.setMaxJumpHight(tmp);
        new JumpStatus().action(athletes);
    }
}