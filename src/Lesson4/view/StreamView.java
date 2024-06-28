package Lesson4.view;

import Lesson4.controller.StreamController;
import Lesson4.model.StudentStream;

import java.util.List;

public class StreamView {
    public void displayAllStreams(List<StudentStream> streams) {
        System.out.println("Потоки:");
        for (StudentStream stream : streams) {
            System.out.println(stream);
        }
    }
}
