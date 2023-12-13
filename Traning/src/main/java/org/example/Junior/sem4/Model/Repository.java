package org.example.Junior.sem4.Model;

import java.util.Collection;
import java.util.List;

public interface Repository<T, TId> {

    void createCourse(T item);

    void deleteCourseByID(TId id);

    T getCourseByID(TId id);

    void deleteAllCourses();

    List<T> getAllCourses();
}
