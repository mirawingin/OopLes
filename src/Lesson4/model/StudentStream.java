package Lesson4.model;


import java.util.ArrayList;
import java.util.List;

public class StudentStream {
    private int streamNumber;
    private String streamName;
    private List<StudentGroup> groups = new ArrayList<>();

    public StudentStream(int streamNumber, String streamName) {
        this.streamNumber = streamNumber;
        this.streamName = streamName;
    }

    public int getStreamNumber() {
        return streamNumber;
    }

    public String getStreamName() {
        return streamName;
    }

    public void addGroup(StudentGroup group) {
        groups.add(group);
    }

    public List<StudentGroup> getGroups() {
        return groups;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Поток ").append(streamNumber).append(": ").append(streamName).append("\n");
        for (StudentGroup group : groups) {
            sb.append("  ").append(group).append("\n");
        }
        return sb.toString();
    }
}