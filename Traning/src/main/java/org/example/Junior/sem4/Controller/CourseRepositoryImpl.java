package org.example.Junior.sem4.Controller;

import org.example.Junior.sem4.Model.Course;
import org.example.Junior.sem4.Model.CoursesRepository;
import org.hibernate.Session;
import java.util.List;


public class CourseRepositoryImpl implements CoursesRepository {
    Connector connector = new Connector();

    @Override
    public void create(Course item) {
        try (Session session = connector.getSession()) {
            session.beginTransaction();
            session.save(item);
            session.getTransaction().commit();
        }
    }

    @Override
    public void updateCourse(int id, String nameCourse, int durationCourse) {
        try (Session session = connector.getSession()) {
            session.beginTransaction();
            Course updCourse = session.get(Course.class, id);
            updCourse.setTitle(nameCourse);
            updCourse.setDuration(durationCourse);
            session.update(updCourse);
            session.getTransaction().commit();
        }
    }

    @Override
    public void delete(Integer id) {
        try (Session session = connector.getSession()) {
            session.beginTransaction();
            Course course = session.get(Course.class, id);
            session.delete(course);
            session.getTransaction().commit();
        }
    }

    @Override
    public Course getByID(Integer id) {
        try (Session session = connector.getSession()) {
            return session.get(Course.class, id);
        }
    }

    @Override
    public void deleteAll() {
        try (Session session = connector.getSession()) {
            session.beginTransaction();
            List<Course> courseList = session.createQuery("FROM Course", Course.class).getResultList();
            courseList.forEach(session::delete);
            session.getTransaction().commit();
        }
    }

    @Override
    public List<Course> getAllList() {
        try (Session session = connector.getSession()) {
            List<Course> courseList = session.createQuery("FROM Course", Course.class).getResultList();
            courseList.forEach(System.out::println);
            return courseList;
        }
    }
}
