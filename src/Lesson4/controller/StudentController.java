package Lesson4.controller;

import Lesson4.model.Student;
import Lesson4.service.StudentService;
import Lesson4.view.StudentView;

import java.util.List;

public class StudentController {
    private StudentService studentService;
    private StudentView studentView;

    public StudentController(StudentService studentService, StudentView studentView) {
        this.studentService = studentService;
        this.studentView = studentView;
    }

    public Student createStudent(String lastName, String firstName, String middleName, int id, String subject) {
        Student student = new Student(lastName, firstName, middleName, id, subject);
        studentService.addStudent(student);
        return student;
    }

    public void displayStudents() {
        studentView.displayAllStudents(getAllStudents());
    }

    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
}
