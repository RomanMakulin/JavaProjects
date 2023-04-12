package org.example.Controller.Login;

import org.example.Model.Card;
import org.example.Model.Pharmacy;
import org.example.View.SwitchPharmacy;

import java.util.List;

public class ChoicePharmacy {
    public void log(List<Pharmacy> pharmacyList, List<Card> cardList){
        boolean pharmacy = true;
        while (pharmacy) {
            String find = new SwitchPharmacy().input(pharmacyList);
            for (int i = 0; i < pharmacyList.size(); i++) {
                if (pharmacyList.get(i).getName().equals(find)) new LoginMenu().service(pharmacyList, i, pharmacy, cardList);
            }
        }
    }
}
