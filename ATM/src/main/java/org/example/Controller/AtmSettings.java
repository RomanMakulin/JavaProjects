package org.example.Controller;

import org.example.Model.ATM;
import org.example.Model.AtmStatus;
import java.util.List;

public class AtmSettings{
    public void service(List<ATM> atm) {
        atm.get(1).setAtmStatus(AtmStatus.OFF);
        atm.get(3).setAtmStatus(AtmStatus.ON_UPDATE);
    }
}
