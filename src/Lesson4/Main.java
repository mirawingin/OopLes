package Lesson4;

import Lesson4.controller.StreamController;
import Lesson4.controller.StudentController;
import Lesson4.controller.TeacherController;
import Lesson4.model.Student;
import Lesson4.model.StudentGroup;
import Lesson4.model.StudentStream;
import Lesson4.model.Teacher;
import Lesson4.service.StreamService;
import Lesson4.service.StudentService;
import Lesson4.service.TeacherService;
import Lesson4.view.StreamView;
import Lesson4.view.StudentView;
import Lesson4.view.TeacherView;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Инициализация сервисов
        TeacherService teacherService = new TeacherService();
        StudentService studentService = new StudentService();
        StreamService streamService = new StreamService();

        // Инициализация контроллеров
        TeacherController teacherController = new TeacherController(teacherService, null); // Передача временного null для TeacherView
        TeacherView teacherView = new TeacherView(teacherController);
        teacherController.setTeacherView(teacherView); // Установка TeacherView после создания TeacherController

        StudentController studentController = new StudentController(studentService, new StudentView());
        StreamController streamController = new StreamController(streamService, new StreamView());

        // Создание учителей
        List<Teacher> teachers = Arrays.asList(
                new Teacher("Вундеркинд", "Виктория", "Андреевна", "Квантовая физика"),
                new Teacher("Звездочёт", "Зенон", "Галактионович", "Астрономия"),
                new Teacher("Рифмоплёт", "Роза", "Ритмовна", "Литература"),
                new Teacher("Цифроед", "Цезарь", "Алгоритмович", "Информатика"),
                new Teacher("Колбочкина", "Катализа", "Реактивовна", "Химия")
        );

        for (Teacher teacher : teachers) {
            teacherController.createTeacher(
                    teacher.getLastName(),
                    teacher.getFirstName(),
                    teacher.getMiddleName(),
                    teacher.getSubject()
            );
        }

        // Создание студентов
        Student student1 = studentController.createStudent("Пытливый", "Александр", "Петрович", 1001, "Физика");
        Student student2 = studentController.createStudent("Любознательная", "Лидия", "Львовна", 1002, "Астрономия");
        Student student3 = studentController.createStudent("Вдумчивый", "Игорь", "Васильевич", 1003, "Физика");
        Student student4 = studentController.createStudent("Мечтательная", "Татьяна", "Михайловна", 1004, "Астрономия");
        Student student5 = studentController.createStudent("Поэтов", "Семён", "Леонидович", 1005, "Литература");
        Student student6 = studentController.createStudent("Менделеев", "Харитон", "Альбертович", 1006, "Химия");

        // Создание групп
        StudentGroup groupPhysics = new StudentGroup(1, "Физики");
        groupPhysics.addStudent(student1);
        groupPhysics.addStudent(student3);

        StudentGroup groupAstronomy = new StudentGroup(2, "Астрономы");
        groupAstronomy.addStudent(student2);
        groupAstronomy.addStudent(student4);

        StudentGroup groupLiterature = new StudentGroup(3, "Литераторы");
        groupLiterature.addStudent(student5);

        StudentGroup groupChemistry = new StudentGroup(4, "Химики");
        groupChemistry.addStudent(student6);

        // Создание потоков
        StudentStream streamScience = streamController.createStream("Поток Естественных Наук");
        streamController.addGroupToStream(streamScience, groupPhysics);
        streamController.addGroupToStream(streamScience, groupAstronomy);

        StudentStream streamHumanities = streamController.createStream("Поток Гуманитарных Наук");
        streamController.addGroupToStream(streamHumanities, groupLiterature);
        streamController.addGroupToStream(streamHumanities, groupChemistry);

        // Основной цикл программы
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            // Вывод информации об учителях, студентах и потоках
            System.out.println("\nУчителя:");
            teacherController.displayTeachers();

            System.out.println("\nГруппы:");
            studentController.displayStudents();

            System.out.println("\nПотоки:");
            streamController.displayStreams();

            // Предложение действий пользователю
            System.out.println("\nВыберите действие:");
            System.out.println("1. Добавить нового учителя");
            System.out.println("2. Редактировать существующего учителя");
            System.out.println("3. Удалить учителя");
            System.out.println("4. Выйти из программы");
            System.out.print("Ваш выбор: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера после считывания числа

            switch (choice) {
                case 1:
                    teacherView.addTeacher();
                    break;
                case 2:
                    teacherView.editTeacher();
                    break;
                case 3:
                    teacherView.deleteTeacher();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Выход из программы.");
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте ещё раз.");
            }
        }

        scanner.close();
    }
}