package Lesson4.controller;

import Lesson4.model.Teacher;
import Lesson4.service.TeacherService;
import Lesson4.view.TeacherView;

public class TeacherController extends BaseController<Teacher> {
    public TeacherController(TeacherService service, TeacherView view) {
        super(service, view);
    }

    public Teacher createTeacher(int id, String lastName, String firstName, String middleName, String subject) {
        Teacher teacher = new Teacher(id, lastName, firstName, middleName, subject);
        create(teacher);
        return teacher;
    }

    public void updateTeacher(Teacher teacher, String newLastName, String newFirstName, String newMiddleName, String newSubject) {
        teacher = new Teacher(teacher.getId(), newLastName, newFirstName, newMiddleName, newSubject);
        update(teacher);
    }
}