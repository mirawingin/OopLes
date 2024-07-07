package Lesson4;

import Lesson4.controller.*;
import Lesson4.model.*;
import Lesson4.service.*;
import Lesson4.view.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Инициализация сервисов
        TeacherService teacherService = new TeacherService();
        StudentService studentService = new StudentService();
        StreamService streamService = new StreamService();

        // Инициализация представлений
        TeacherView teacherView = new TeacherView();
        StudentView studentView = new StudentView();
        StreamView streamView = new StreamView();

        // Инициализация контроллеров
        TeacherController teacherController = new TeacherController(teacherService, teacherView);
        StudentController studentController = new StudentController(studentService, studentView);
        StreamController streamController = new StreamController(streamService, streamView);

        // Заполнение начальными данными
        teacherController.createTeacher(1, "Вундеркинд", "Виктория", "Андреевна", "Квантовая физика");
        teacherController.createTeacher(2, "Звездочёт", "Зенон", "Галактионович", "Астрономия");
        teacherController.createTeacher(3, "Рифмоплёт", "Роза", "Ритмовна", "Литература");
        teacherController.createTeacher(4, "Цифроед", "Цезарь", "Алгоритмович", "Информатика");
        teacherController.createTeacher(5, "Колбочкина", "Катализа", "Реактивовна", "Химия");

        studentController.createStudent(1001, "Пытливый", "Александр", "Петрович", "Физика");
        studentController.createStudent(1002, "Любознательная", "Лидия", "Львовна", "Астрономия");
        studentController.createStudent(1003, "Вдумчивый", "Игорь", "Васильевич", "Физика");
        studentController.createStudent(1004, "Мечтательная", "Татьяна", "Михайловна", "Астрономия");
        studentController.createStudent(1005, "Поэтов", "Семён", "Леонидович", "Литература");
        studentController.createStudent(1006, "Менделеев", "Харитон", "Альбертович", "Химия");

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nМеню:");
            System.out.println("1. Учителя и предметы");
            System.out.println("2. Студенты и предметы");
            System.out.println("3. Потоки и группы");
            System.out.println("4. Работа с учителями");
            System.out.println("5. Работа со студентами");
            System.out.println("6. Создание учебной группы");
            System.out.println("7. Выход");
            System.out.print("Ваш выбор: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера после считывания числа

            switch (choice) {
                case 1:
                    teacherController.displayAll();
                    break;
                case 2:
                    studentController.displayAll();
                    break;
                case 3:
                    streamController.displayAllStreams();
                    break;
                case 4:
                    teacherMenu(teacherController, scanner);
                    break;
                case 5:
                    studentMenu(studentController, scanner);
                    break;
                case 6:
                    createGroupMenu(teacherController, studentController, streamController, scanner);
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте ещё раз.");
            }
        }

        scanner.close();
    }

    private static void teacherMenu(TeacherController teacherController, Scanner scanner) {
        System.out.println("\nРабота с учителями:");
        System.out.println("1. Добавить нового учителя");
        System.out.println("2. Редактировать существующего учителя");
        System.out.println("3. Удалить учителя");
        System.out.print("Ваш выбор: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера после считывания числа

        switch (choice) {
            case 1:
                addTeacher(teacherController, scanner);
                break;
            case 2:
                editTeacher(teacherController, scanner);
                break;
            case 3:
                deleteTeacher(teacherController, scanner);
                break;
            default:
                System.out.println("Неверный выбор. Попробуйте ещё раз.");
        }
    }

    private static void addTeacher(TeacherController teacherController, Scanner scanner) {
        System.out.println("Введите фамилию учителя:");
        String lastName = scanner.nextLine();
        System.out.println("Введите имя учителя:");
        String firstName = scanner.nextLine();
        System.out.println("Введите отчество учителя:");
        String middleName = scanner.nextLine();
        System.out.println("Введите предмет, который ведёт учитель:");
        String subject = scanner.nextLine();
        System.out.println("Введите ID учителя:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера после считывания числа
        teacherController.createTeacher(id, lastName, firstName, middleName, subject);
    }

    private static void editTeacher(TeacherController teacherController, Scanner scanner) {
        System.out.println("Введите ID учителя для редактирования:");
        int teacherId = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера после считывания числа

        Teacher teacher = teacherController.getById(teacherId);
        if (
        teacher == null) {
            System.out.println("Учитель с указанным ID не найден.");
            return;
        }

        System.out.println("Текущая информация: " + teacher);
        System.out.println("Введите новую фамилию учителя:");
        String newLastName = scanner.nextLine();
        System.out.println("Введите новое имя учителя:");
        String newFirstName = scanner.nextLine();
        System.out.println("Введите новое отчество учителя:");
        String newMiddleName = scanner.nextLine();
        System.out.println("Введите новый предмет, который ведёт учитель:");
        String newSubject = scanner.nextLine();

        teacherController.updateTeacher(teacher, newLastName, newFirstName, newMiddleName, newSubject);
    }

    private static void deleteTeacher(TeacherController teacherController, Scanner scanner) {
        System.out.println("Введите ID учителя для удаления:");
        int teacherId = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера после считывания числа
        teacherController.delete(teacherId);
    }

    private static void studentMenu(StudentController studentController, Scanner scanner) {
        System.out.println("\nРабота со студентами:");
        System.out.println("1. Добавить нового студента");
        System.out.println("2. Редактировать существующего студента");
        System.out.println("3. Удалить студента");
        System.out.print("Ваш выбор: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера после считывания числа

        switch (choice) {
            case 1:
                addStudent(studentController, scanner);
                break;
            case 2:
                editStudent(studentController, scanner);
                break;
            case 3:
                deleteStudent(studentController, scanner);
                break;
            default:
                System.out.println("Неверный выбор. Попробуйте ещё раз.");
        }
    }

    private static void addStudent(StudentController studentController, Scanner scanner) {
        System.out.println("Введите фамилию студента:");
        String lastName = scanner.nextLine();
        System.out.println("Введите имя студента:");
        String firstName = scanner.nextLine();
        System.out.println("Введите отчество студента:");
        String middleName = scanner.nextLine();
        System.out.println("Введите предмет, который изучает студент:");
        String subject = scanner.nextLine();
        System.out.println("Введите ID студента:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера после считывания числа
        studentController.createStudent(id, lastName, firstName, middleName, subject);
    }

    private static void editStudent(StudentController studentController, Scanner scanner) {
        System.out.println("Введите ID студента для редактирования:");
        int studentId = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера после считывания числа

        Student student = studentController.getById(studentId);
        if (student == null) {
            System.out.println("Студент с указанным ID не найден.");
            return;
        }

        System.out.println("Текущая информация: " + student);
        System.out.println("Введите новую фамилию студента:");
        String newLastName = scanner.nextLine();
        System.out.println("Введите новое имя студента:");
        String newFirstName = scanner.nextLine();
        System.out.println("Введите новое отчество студента:");
        String newMiddleName = scanner.nextLine();
        System.out.println("Введите новый предмет, который изучает студент:");
        String newSubject = scanner.nextLine();

        studentController.updateStudent(student, newLastName, newFirstName, newMiddleName, newSubject);
    }

    private static void deleteStudent(StudentController studentController, Scanner scanner) {
        System.out.println("Введите ID студента для удаления:");
        int studentId = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера после считывания числа
        studentController.delete(studentId);
    }

    private static void createGroupMenu(TeacherController teacherController, StudentController studentController, StreamController streamController, Scanner scanner) {
        System.out.println("Введите ID потока:");
        int streamId = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера после считывания числа
        System.out.println("Введите название потока:");
        String streamName = scanner.nextLine();

        List<Teacher> teachers = new ArrayList<>();
        List<Student> students = new ArrayList<>();

        System.out.println("Введите количество учителей в группе:");
        int teacherCount = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера после считывания числа

        for (int i = 0; i < teacherCount; i++) {
            System.out.println("Введите ID учителя " + (i + 1) + ":");
            int teacherId = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера после считывания числа
            Teacher teacher = teacherController.getById(teacherId);
            if (teacher != null) {
                teachers.add(teacher);
            } else {
                System.out.println("Учитель с ID " + teacherId + " не найден.");
            }
        }

        System.out.println("Введите количество студентов в группе:");
        int studentCount = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера после считывания числа

        for (int i = 0; i < studentCount; i++) {
            System.out.println("Введите ID студента " + (i + 1) + ":");
            int studentId = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера после считывания числа
            Student student = studentController.getById(studentId);
            if (student != null) {
                students.add(student);
            } else {
                System.out.println("Студент с ID " + studentId + " не найден.");
            }
        }

        Group group = new Group(streamId, teachers, students);
        List<Group> groups = new ArrayList<>();
        groups.add(group);

        Stream stream = new Stream(streamId, streamName, groups);
        streamController.createStream(stream);

        System.out.println("Учебная группа успешно создана в потоке " + streamName);
    }
}