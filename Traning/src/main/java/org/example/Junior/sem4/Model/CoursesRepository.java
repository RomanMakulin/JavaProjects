package org.example.Junior.sem4.Model;

public interface CoursesRepository extends Repository<Course, Integer>{
    void updateCourse(int id, String nameCourse, int durationCourse);
}
