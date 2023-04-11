package org.example.View;

import org.example.Model.Pharmacy;

import java.util.List;

public class ShowUsers {
    public void view(List<Pharmacy> pharmacyList, int i){
        for (int j = 0; j < pharmacyList.get(i).getUserList().size(); j++) {
            System.out.println(pharmacyList.get(i).getUserList().get(j).getName());
        }
    }
}
