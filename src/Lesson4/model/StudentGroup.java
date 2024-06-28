package Lesson4.model;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    private int id;
    private String name;
    private List<Student> students = new ArrayList<>();

    public StudentGroup(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public String toString() {
        return "Группа: " + name + ", Студенты: " + students;
    }
}