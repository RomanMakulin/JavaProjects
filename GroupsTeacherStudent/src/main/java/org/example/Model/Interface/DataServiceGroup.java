package org.example.Model.Interface;

import org.example.Model.StudGroup.StudyGroup;
import org.example.Model.User.User;

import java.util.List;

public interface DataServiceGroup<T> {
    StudyGroup createGroup(User teacher, List<T> studentList);
}
