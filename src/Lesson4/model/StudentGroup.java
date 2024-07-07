package Lesson4.model;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    private String name;
    private List<Student> students;

    public StudentGroup(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Student student : students) {
            sb.append(student.toString()).append("\n");
        }
        return sb.toString();
    }
}