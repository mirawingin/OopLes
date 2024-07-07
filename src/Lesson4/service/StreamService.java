package Lesson4.service;

import Lesson4.model.Stream;

import java.util.ArrayList;
import java.util.List;

public class StreamService {
    private List<Stream> streams = new ArrayList<>();

    public void createStream(Stream stream) {
        streams.add(stream);
    }

    public List<Stream> getAllStreams() {
        return streams;
    }
}