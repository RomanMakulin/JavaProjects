package org.example.Model;

import org.example.View.View;

import java.util.*;

public class InitMenu {
    public StudyGroup buttonClick(int maxGroupValue) {

        UserService userService = new UserService();
        View view = new View();
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        generateStudents(maxGroupValue, students, userService, scanner);
        StudyGroup group = groupGenerate(userService, scanner, students);

        System.out.println(view.usersView(Arrays.asList(group)));
        return group;

    }

    public void generateStudents(int groupValue, List<Student> students, UserService userService, Scanner scanner) {
        groupValue = 4;
        for (int i = 0; i < groupValue; i++) {
            System.out.printf("Введите имя студента #%d: \n", i);
            students.add(userService.create(new Student(scanner.nextLine(), new Date())));
        }
    }

    public StudyGroup groupGenerate(UserService userService, Scanner scanner, List<Student> students) {
        System.out.println("Введите имя учителя: ");
        StudyGroup group = new StudyGroupService().createGroup(userService.create(new Teacher(scanner.nextLine(), new Date())), students);
        return group;
    }
}
