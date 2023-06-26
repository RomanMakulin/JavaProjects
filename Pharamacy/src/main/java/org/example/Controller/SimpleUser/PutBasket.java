package org.example.Controller.SimpleUser;

import org.example.Controller.FileWork.UpdateFiles.SaveProducts;
import org.example.Model.Medicines;
import org.example.Model.Pharmacy;
import org.example.Model.User;
import org.example.View.Input.InputCountMedicine;
import org.example.View.Input.InputIdMedicine;
import org.example.View.NotEnoughMoney;
import org.example.View.NotFoundId;
import org.example.View.NotUserFound;
import org.example.View.ViewMedicine;
import java.util.List;

public class PutBasket {
    public void put(Pharmacy pharmacy, User user) {
        new ViewMedicine().service(pharmacy);

        try {
            int id = new InputIdMedicine().input();
            int needCount = new InputCountMedicine().input();
            int newCurrent = pharmacy.getMedicinesList().get(id).getCount() - needCount;
            int tempPrice = pharmacy.getMedicinesList().get(id).getPrice() * needCount;
            List<Medicines> basket = user.getBasket().getBasketList();
            Medicines medicine = pharmacy.getMedicinesList().get(id);

            if (user.getMoney() >= tempPrice) {
                if (newCurrent >= 0) {
                    medicine.setCount(newCurrent);
                    basket.add(new Medicines(medicine.getName(), medicine.getPrice(), needCount));
                    user.setMoney(user.getMoney() - tempPrice);
                }
            } else new NotEnoughMoney().show();

            new SaveProducts().save(pharmacy);
        } catch (IndexOutOfBoundsException e){
            new NotFoundId().show();
        }

    }
}
