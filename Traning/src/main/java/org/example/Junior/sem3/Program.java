package org.example.Junior.sem3;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.*;
public class Program {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //region classic implements Serializable
//        Student student = new Student("Roman", 25, 99.9); // объект сериализования
//        Student student1; // для десериализования
//
//        try (FileOutputStream fileOutputStream = new FileOutputStream("student.bin")){
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//            objectOutputStream.writeObject(student);
//            System.out.println("Объект сериализован");
//        }
//
//        try (FileInputStream fileInputStream = new FileInputStream("student.bin")){
//            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//            student1 = (Student) objectInputStream.readObject();
//            System.out.println("Объект десериализован");
//        }
        //endregion

        //region implements Externalizable
//        StudentNew studentNew = new StudentNew("Roma", 25, 999.9);
//        studentNew.writeExternal(new ObjectOutputStream(new FileOutputStream("test.txt")));
//
//        StudentNew studentNew1 = new StudentNew();
//        studentNew1.readExternal(new ObjectInputStream(new FileInputStream("test.txt")));
//        System.out.println(studentNew1);
        //endregion

        //region Jackson method
        ObjectMapper objectMapper = new ObjectMapper();
        Student student = new Student("Roman", 25, 99.9);
        Student student1;

//        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
//        objectMapper.writeValue(new File("data.json"), student);

        student1 = objectMapper.readValue(new File("data.json"), Student.class);
        System.out.println(student1);
        //endregion

    }
}
