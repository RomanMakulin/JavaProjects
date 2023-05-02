package org.example.Controller.SimpleUser;

import org.example.Controller.FileWork.UpdateFiles.SaveCards;
import org.example.Model.Card;
import org.example.Model.User;
import org.example.View.Input.InputIdCard;
import org.example.View.Input.InputNeedMoney;
import org.example.View.Input.InputPinCard;
import org.example.View.NotEnoughMoney;
import org.example.View.WrongPin;
import java.util.List;

public class IncreaseMoney {
    public void service(User user, List<Card> cardList) {
        int id = new InputIdCard().input();
        int pin = new InputPinCard().input();

        for (int k = 0; k < cardList.size(); k++) {
            if (cardList.get(k).getID() == id) {
                if (cardList.get(k).getPin() == pin) {
                    int needMoney = new InputNeedMoney().input();

                    if (cardList.get(k).getMoney() >= needMoney) {
                        user.setMoney(user.getMoney() + needMoney);
                        cardList.get(k).setMoney(cardList.get(k).getMoney() - needMoney);
                        new SaveCards().save(cardList);
                    } else new NotEnoughMoney().show();

                } else new WrongPin().show();
            }
        }
    }
}
