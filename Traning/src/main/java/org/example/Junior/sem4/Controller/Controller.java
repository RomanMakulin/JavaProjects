package org.example.Junior.sem4.Controller;

import org.example.Junior.sem4.Model.Course;

import java.util.List;

public class Controller {
    public void btnClick(){
        CourseRepositoryImpl courseRepository = new CourseRepositoryImpl();

        courseRepository.create(new Course("Java junior", 30));
        courseRepository.create(new Course("JDK", 20));
        courseRepository.create(new Course("Java hibernate", 1));
//        courseRepository.deleteCourseByID(2);
//        courseRepository.updateCourse(1, "Java junior", 40);
//        System.out.printf(courseRepository.getCourseByID(1).toString());
//        courseRepository.deleteAllCourses();
        List<Course> courseList = courseRepository.getAllList();
    }
}
