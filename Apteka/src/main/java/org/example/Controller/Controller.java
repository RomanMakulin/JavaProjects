package org.example.Controller;

import org.example.Model.*;
import org.example.View.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    public void buttonClick() {

        // Набор лекарств для первой аптеки
        List<Medicines> medicinesList = new ArrayList<>();
        medicinesList.add(new Medicines("Pentalgin", 500, 10));
        medicinesList.add(new Medicines("Antolgin", 500, 10));
        medicinesList.add(new Medicines("Swilgin", 500, 10));

        // Набор лекарств для второй аптеки
        List<Medicines> medicinesList2 = new ArrayList<>();
        medicinesList.add(new Medicines("Analgin", 500, 10));
        medicinesList.add(new Medicines("Capoprin", 500, 10));
        medicinesList.add(new Medicines("Vasilin", 500, 10));

        // Список аптек
        List<Pharmacy> pharmacyList = new ArrayList<>();
        pharmacyList.add(new Pharmacy("Будь здоров", "on", medicinesList));
        pharmacyList.add(new Pharmacy("Аптека 360", "on", medicinesList2));


        // вход или регистрация для конкретной аптеки
        while (true) {

            for (int i = 0; i < pharmacyList.size(); i++) {
                if (pharmacyList.get(i).getName().equals(new SwitchPharmacy().input(pharmacyList))) {

                    switch (new SwitchLoginRegistration().input()) {
                        case "1":
                            // вход
                            for (int j = 0; j < pharmacyList.get(i).getUserList().size(); j++) {
                                if (new InputLogin().input().equals(pharmacyList.get(i).getUserList().get(j).getName())
                                        && new InputPassword().input() == pharmacyList.get(i).getUserList().get(j).getPassword()) {
                                    if (pharmacyList.get(i).getUserList().get(j) instanceof Administrator) {
                                        System.out.println("compl adm!");
                                        // adm profile
                                        System.out.println("Меню администратирования:\n1 - добавить лекарство\n" +
                                                "2 - редактировать информацию о лекарстве\n3 - удалить лекарство");

                                        switch (new Scanner(System.in).nextLine()){
                                            case "1":
                                                pharmacyList.get(i).getMedicinesList().add(new Medicines(
                                                        new InputNameMedicine().input(), new InputPriceMedicine().input(), new InputCountMedicine().input()));
                                                break;
                                            case "2":

                                                for (int k = 0; k < pharmacyList.get(i).getMedicinesList().size(); k++) {
                                                    System.out.println("ID: " + k + " " + pharmacyList.get(i).getMedicinesList().get(k));
                                                }

                                                System.out.println("1 - изменить цену\n2 - изменить количество\n3 - изменить название");

                                                int switchCmd = new Scanner(System.in).nextInt();

                                                switch (new Scanner(System.in).nextLine()){
                                                    case "1":
                                                        pharmacyList.get(i).getMedicinesList().get(
                                                                new InputIdMedicine().input()).setPrice(new InputPriceMedicine().input());
                                                        break;
                                                    case "2":
                                                        pharmacyList.get(i).getMedicinesList().get(
                                                                new InputIdMedicine().input()).setCount(new InputCountMedicine().input());
                                                        break;
                                                    case "3":
                                                        pharmacyList.get(i).getMedicinesList().get(
                                                                new InputIdMedicine().input()).setName(new InputNameMedicine().input());
                                                        break;
                                                    default: new WrongCmd().error();

                                                }

                                        }

                                    } else {
                                        System.out.println("compl simple!");
                                        // simple user profile
                                    }
                                }
                            }
                            break;

                        case "2":
                            pharmacyList.get(i).getUserList().add(new SimpleUser(new InputLogin().input(), new InputPassword().input(), pharmacyList.get(i)));
                            break;

                        default:
                            new WrongCmd().error();
                            break;
                    }
                }

            }

        }
    }


}

