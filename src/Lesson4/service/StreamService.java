package Lesson4.service;

import Lesson4.model.StudentStream;
import Lesson4.model.StudentGroup;
import java.util.ArrayList;
import java.util.List;

public class StreamService {
    private List<StudentStream> streams = new ArrayList<>();
    private int nextStreamNumber = 1; // Счетчик для нумерации потоков

    public StudentStream createStream(String streamName) {
        StudentStream stream = new StudentStream(nextStreamNumber++, streamName);
        streams.add(stream);
        return stream;
    }

    public void addGroupToStream(StudentStream stream, StudentGroup group) {
        stream.addGroup(group);
    }

    public List<StudentStream> getAllStreams() {
        return streams;
    }
}
