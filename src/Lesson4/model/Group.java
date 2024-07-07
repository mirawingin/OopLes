package Lesson4.model;

import java.util.List;

public class Group {
    private int id;
    private List<Teacher> teachers;
    private List<Student> students;

    public Group(int id, List<Teacher> teachers, List<Student> students) {
        this.id = id;
        this.teachers = teachers;
        this.students = students;
    }

    public int getId() {
        return id;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Группа " + id;
    }
}
