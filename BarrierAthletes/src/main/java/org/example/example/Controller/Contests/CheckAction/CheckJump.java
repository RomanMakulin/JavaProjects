package org.example.example.Controller.Contests.CheckAction;

import org.example.example.Model.Actions.Jump;
import org.example.example.Model.Athletes.Athletes;
import org.example.example.Model.Barrier.Barriers;
import org.example.example.Model.Interfaces.Check;
import org.example.example.View.Status.LossPlayer;

import java.util.List;

public class CheckJump implements Check {
    @Override
    public void service(Athletes athletes, Barriers barriers, List<Athletes> players) {
        if (athletes.getMaxJumpHight() >= barriers.getValueBarrier()) {
            new Jump().action(athletes);
            new CurrentValJump().service(athletes, barriers, players);
        } else {
            new LossPlayer().action(athletes);
        }
    }
}
