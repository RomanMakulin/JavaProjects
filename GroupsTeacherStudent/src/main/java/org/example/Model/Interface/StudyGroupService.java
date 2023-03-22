package org.example.Model.Interface;

import org.example.Model.StudGroup.StudyGroup;
import org.example.Model.User.Teacher;
import org.example.Model.User.User;
import java.util.List;

public class StudyGroupService implements DataServiceGroup {

    @Override
    public StudyGroup createGroup(Teacher teacher, List studentList) {
        return new StudyGroup(teacher, studentList);
    }

}
