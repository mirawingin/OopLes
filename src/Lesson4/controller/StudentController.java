package Lesson4.controller;

import Lesson4.model.Student;
import Lesson4.service.StudentService;
import Lesson4.view.StudentView;

public class StudentController extends BaseController<Student> {
    public StudentController(StudentService service, StudentView view) {
        super(service, view);
    }

    public Student createStudent(int id, String lastName, String firstName, String middleName, String subject) {
        Student student = new Student(id, lastName, firstName, middleName, subject);
        create(student);
        return student;
    }

    public void updateStudent(Student student, String newLastName, String newFirstName, String newMiddleName, String newSubject) {
        student = new Student(student.getId(), newLastName, newFirstName, newMiddleName, newSubject);
        update(student);
    }
}