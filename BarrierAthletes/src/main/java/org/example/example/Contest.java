package org.example.example;

public class Contest {
    Barrier[] barriers;
    Athletes[] athletes;

    public Contest(Barrier[] barriers, Athletes[] athletes) {
        this.barriers = barriers;
        this.athletes = athletes;
    }

    public void checkRun(int i, int j) {
        if (athletes[j].maxRunDistance >= barriers[i].getVal()) {
            athletes[j].run();
            updCurrentValRun(i, j);
        } else {
            System.out.println("[" + athletes[j].type + "] " + athletes[j].name + " выбывает!");
            athletes[j] = null;
        }
    }

    public void checkJump(int i, int j) {
        if (athletes[j].maxJumpHight >= barriers[i].getVal()) {
            athletes[j].jump();
            updCurrentValJump(i, j);
        } else {
            System.out.println("[" + athletes[j].type + "] " + athletes[j].name + " выбывает!");
            athletes[j] = null;
        }
    }

    public void updCurrentValRun(int i, int j) {
        athletes[j].maxRunDistance -= barriers[i].getVal();
        System.out.println("Остались силы пробежать ещё " + athletes[j].maxRunDistance + " м.");
    }

    public void updCurrentValJump(int i, int j) {
        athletes[j].maxJumpHight -= barriers[i].getVal();
        System.out.println("Остались силы прыгнуть на " + athletes[j].maxJumpHight + " м.");
    }

    public void checkWinner() {
        for (int i = 0; i < athletes.length; i++) {
            if (athletes[i] != null) {
                System.out.println(athletes[i].name + " победитель!");
            }
        }
    }

    public void contestFight() {
        for (int i = 0; i < barriers.length; i++) {
            for (int j = 0; j < athletes.length; j++) {
                if (barriers[i] instanceof Runroad && athletes[j] != null) checkRun(i, j);
                else if (athletes[j] != null) checkJump(i, j);
            }
        }
    }

}