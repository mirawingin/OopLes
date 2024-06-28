package Lesson4.view;

import Lesson4.controller.StudentController;
import Lesson4.model.Student;

import java.util.List;

public class StudentView {
    public void displayAllStudents(List<Student> students) {
        System.out.println("Студенты:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
