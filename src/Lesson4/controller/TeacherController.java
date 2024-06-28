package Lesson4.controller;

import Lesson4.model.Teacher;
import Lesson4.service.TeacherService;
import Lesson4.view.TeacherView;

import java.util.List;

public class TeacherController {
    private TeacherService teacherService;
    private TeacherView teacherView;

    public TeacherController(TeacherService teacherService, TeacherView teacherView) {
        this.teacherService = teacherService;
        this.teacherView = teacherView;
    }

    public void setTeacherView(TeacherView teacherView) {
        this.teacherView = teacherView;
    }

    public Teacher createTeacher(String lastName, String firstName, String middleName, String subject) {
        Teacher teacher = new Teacher(lastName, firstName, middleName, subject);
        teacherService.addTeacher(teacher);
        return teacher;
    }

    public void updateTeacher(Teacher teacher, String newLastName, String newFirstName, String newMiddleName, String newSubject) {
        teacher.setLastName(newLastName);
        teacher.setFirstName(newFirstName);
        teacher.setMiddleName(newMiddleName);
        teacher.setSubject(newSubject);
        teacherService.updateTeacher(teacher);
    }

    public void deleteTeacher(Teacher teacher) {
        teacherService.deleteTeacher(teacher);
    }

    public List<Teacher> getAllTeachers() {
        return teacherService.getAllTeachers();
    }

    public void displayTeachers() {
        teacherView.displayAllTeachers(getAllTeachers());
    }
}