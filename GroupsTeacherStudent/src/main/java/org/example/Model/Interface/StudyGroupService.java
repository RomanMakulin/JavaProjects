package org.example.Model.Interface;

import org.example.Model.StudGroup.StudyGroup;
import org.example.Model.User.User;
import java.util.List;

public class StudyGroupService implements DataServiceGroup {

    @Override
    public StudyGroup createGroup(User teacher, List studentList) {
        StudyGroup group = new StudyGroup(teacher, studentList);
        return group;
    }

}
