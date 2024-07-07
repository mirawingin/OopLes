package Lesson4.model;

import java.util.List;

public class Stream {
    private int id;
    private String name;
    private List<Group> groups;

    public Stream(int id, String name, List<Group> groups) {
        this.id = id;
        this.name = name;
        this.groups = groups;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Group> getGroups() {
        return groups;
    }

    @Override
    public String toString() {
        return "Поток " + id + ": " + name;
    }
}