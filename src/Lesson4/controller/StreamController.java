package Lesson4.controller;

import Lesson4.model.Stream;
import Lesson4.service.StreamService;
import Lesson4.view.StreamView;

public class StreamController {
    private StreamService streamService;
    private StreamView streamView;

    public StreamController(StreamService streamService, StreamView streamView) {
        this.streamService = streamService;
        this.streamView = streamView;
    }

    public void createStream(Stream stream) {
        streamService.createStream(stream);
    }

    public void displayAllStreams() {
        streamView.displayAllStreams(streamService.getAllStreams());
    }
}