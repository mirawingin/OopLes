package Lesson4.service;

import Lesson4.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    private List<Teacher> teachers = new ArrayList<>();

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void updateTeacher(Teacher teacher) {
        // Обновление учителя не требует отдельного кода, так как объект уже изменен
    }

    public void deleteTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }

    public List<Teacher> getAllTeachers() {
        return teachers;
    }
}