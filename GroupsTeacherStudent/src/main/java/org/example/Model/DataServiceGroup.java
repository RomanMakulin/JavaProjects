package org.example.Model;

import java.util.List;

public interface DataServiceGroup {
    StudyGroup createGroup(Teacher teacher, List<Student> studentList);
}
