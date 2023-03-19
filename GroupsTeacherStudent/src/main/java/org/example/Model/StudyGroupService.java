package org.example.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudyGroupService implements DataServiceGroup{

    @Override
    public StudyGroup createGroup(Teacher teacher, List<Student> studentList) {
        StudyGroup group = new StudyGroup(teacher, studentList);
        return group;
    }



}
