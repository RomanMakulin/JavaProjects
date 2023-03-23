package org.example.Controller;

import org.example.Model.StudGroup.StudyGroup;
import org.example.View.GetInf;

public class GroupCount {
    public void buttonClick(GetInf input){
        int countGroups = Integer.parseInt(input.inputName("Введите кол-во групп для создания: "));
        for (int i = 0; i < countGroups; i++) {
            new Controller().completeGroup(new GetInf());
        }
    }
}
