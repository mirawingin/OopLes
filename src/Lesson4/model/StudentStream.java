package Lesson4.model;


import java.util.ArrayList;
import java.util.List;

public class StudentStream {
    private String name;
    private List<StudentGroup> groups;

    public StudentStream(String name) {
        this.name = name;
        this.groups = new ArrayList<>();
    }

    public void addGroup(StudentGroup group) {
        groups.add(group);
    }

    public String getName() {
        return name;
    }

    public List<StudentGroup> getGroups() {
        return groups;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (StudentGroup group : groups) {
            sb.append(group.getName()).append(": ").append(group.toString()).append("\n");
        }
        return sb.toString();
    }
}