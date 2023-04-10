package org.example.Controller;

import org.example.Model.*;
import org.example.View.*;

import java.util.ArrayList;
import java.util.Arrays;
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

        Pharmacy pharmacy1 = new Pharmacy("Будь здоров", "on", medicinesList);
        Pharmacy pharmacy2 = new Pharmacy("Вторая", "on", medicinesList2);

        List<Pharmacy> pharmacyList = Arrays.asList(pharmacy1, pharmacy2);

        pharmacyList.get(0).getUserList().add(new Administrator("Roman", 123));
        pharmacyList.get(1).getUserList().add(new SimpleUser("Roman1", 123));



        // вход или регистрация для конкретной аптеки
        while (true) {

            String find = new SwitchPharmacy().input(pharmacyList);
            for (int i = 0; i < pharmacyList.size(); i++) {
                if (pharmacyList.get(i).getName().equals(find)) {



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
                                                break;
                                            case "3":
                                                for (int k = 0; k < pharmacyList.get(i).getMedicinesList().size(); k++) {
                                                    System.out.println("ID: " + k + " " + pharmacyList.get(i).getMedicinesList().get(k));
                                                }
                                                pharmacyList.get(i).getMedicinesList().remove(new InputIdMedicine().input());
                                                break;

                                        }

                                    } else {
                                        System.out.println("compl simple!");

                                            System.out.println("Введите ID товара для добавления в корзину: ");
                                            int id = new Scanner(System.in).nextInt();

                                            for (int i = 0; i < pharmacyList.get(i).getMedicinesList().size(); i++) {

                                            }

                                    }
                                }
                            }
                            break;

                        case "2":
                            pharmacyList.get(i).getUserList().add(new SimpleUser(new InputLogin().input(), new InputPassword().input()));
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

