package org.example;

public class Contest {
    Barrier[] barriers;
    Athletes[] athletes;

    public Contest(Barrier[] barriers, Athletes[] athletes) {
        this.barriers = barriers;
        this.athletes = athletes;
    }

    public void ContestFight() {
        for (int i = 0; i < barriers.length; i++) {
            for (int j = 0; j < athletes.length; j++) {
                if (barriers[i].type == "run" && athletes[j] != null) {
                    if (athletes[j].maxRunDistance >= barriers[i].getVal()) {
                        athletes[j].run();
                        athletes[j].maxRunDistance -= barriers[i].getVal();
                        System.out.println("Остались силы пробюежать ещё " + athletes[j].maxRunDistance + " м.");
                        System.out.println();
                    } else {
                        System.out.println("[" + athletes[j].type + "] " + athletes[j].name + " выбывает!");
                        athletes[j] = null;
                    }
                } else if (athletes[j] != null) {
                    if (athletes[j].maxJumpHight >= barriers[i].getVal()) {
                        athletes[j].jump();
                        athletes[j].maxJumpHight -= barriers[i].getVal();
                        System.out.println("Остались силы прыгнуть на " + athletes[j].maxJumpHight + " м.");
                        System.out.println();
                    } else {
                        System.out.println("[" + athletes[j].type + "] " + athletes[j].name + " выбывает!");
                        athletes[j] = null;
                    }
                }
            }
            System.out.println();
        }
        for (int i = 0; i < athletes.length; i++) {
            if (athletes[i] != null) {
                System.out.println(athletes[i].name + " победитель!");
            }
        }
    }
}
