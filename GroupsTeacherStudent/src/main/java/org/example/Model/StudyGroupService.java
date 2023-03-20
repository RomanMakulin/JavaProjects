package org.example.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudyGroupService implements DataServiceGroup{

    @Override
    public StudyGroup createGroup(User teacher, List studentList) {
        StudyGroup group = new StudyGroup(teacher, studentList);
        return group;
    }



}
