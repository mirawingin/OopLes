package Lesson3;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем несколько учебных групп
        LearningGroup group1 = new LearningGroupImpl("Группа 1");
        LearningGroup group2 = new LearningGroupImpl("Группа 2");
        LearningGroup group3 = new LearningGroupImpl("Группа 3");

        // Создаем потоки и добавляем в них группы
        Stream stream1 = new StreamImpl();
        stream1.addGroup(group1);
        stream1.addGroup(group2);

        Stream stream2 = new StreamImpl();
        stream2.addGroup(group3);

        Stream stream3 = new StreamImpl();
        stream3.addGroup(group1);
        stream3.addGroup(group2);
        stream3.addGroup(group3);

        // Создаем список потоков
        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);
        streams.add(stream3);

        // Создаем контроллер и сортируем потоки
        Controller controller = new Controller();
        controller.sortStreams(streams);

        // Выводим отсортированные потоки
        for (Stream stream : streams) {
            System.out.println("Поток с " + stream.getGroupCount() + " группами:");
            for (LearningGroup group : stream) {
                System.out.println(" - " + group.getGroupName());
            }
        }
    }
}
