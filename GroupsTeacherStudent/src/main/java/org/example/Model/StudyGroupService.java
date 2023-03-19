package org.example.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudyGroupService extends StudyGroup{

    List<StudyGroup> studyGroups;

    public StudyGroupService(Teacher teacher, List<Student> students) {
        super(teacher, students);
    }

    List<StudyGroup> generate(Teacher teacher, List<Student> students) {
        studyGroups = new ArrayList<>();
        return studyGroups;
    }
}
