package Lesson4.view;

import Lesson4.model.Stream;
import Lesson4.model.Group;
import Lesson4.model.Teacher;
import Lesson4.model.Student;

import java.util.List;

public class StreamView {
    public void displayAllStreams(List<Stream> streams) {
        System.out.println("Потоки:");
        for (Stream stream : streams) {
            System.out.println(stream);
            for (Group group : stream.getGroups()) {
                System.out.println("  " + group);
                System.out.println("    Учителя:");
                for (Teacher teacher : group.getTeachers()) {
                    System.out.println("      " + teacher);
                }
                System.out.println("    Студенты:");
                for (Student student : group.getStudents()) {
                    System.out.println("      " + student);
                }
            }
        }
    }
}
