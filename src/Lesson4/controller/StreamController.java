package Lesson4.controller;

import Lesson4.model.StudentGroup;
import Lesson4.model.StudentStream;
import Lesson4.service.StreamService;
import Lesson4.view.StreamView;

import java.util.List;

public class StreamController {
    private StreamService streamService;
    private StreamView streamView;

    public StreamController(StreamService streamService, StreamView streamView) {
        this.streamService = streamService;
        this.streamView = streamView;
    }

    public StudentStream createStream(String streamName) {
        return streamService.createStream(streamName);
    }

    public void addGroupToStream(StudentStream stream, StudentGroup group) {
        streamService.addGroupToStream(stream, group);
    }

    public void displayStreams() {
        streamView.displayAllStreams(getAllStreams());
    }

    public List<StudentStream> getAllStreams() {
        return streamService.getAllStreams();
    }
}