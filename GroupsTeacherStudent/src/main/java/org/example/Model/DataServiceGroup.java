package org.example.Model;

import java.util.List;

public interface DataServiceGroup<T> {
    StudyGroup createGroup(User teacher, List<T> studentList);
}
