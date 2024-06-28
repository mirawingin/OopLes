package Lesson4.view;

import Lesson4.controller.TeacherController;
import Lesson4.model.Teacher;

import java.util.List;
import java.util.Scanner;

public class TeacherView {
    private TeacherController teacherController;
    private Scanner scanner = new Scanner(System.in);

    public TeacherView(TeacherController teacherController) {
        this.teacherController = teacherController;
    }

    public void displayAllTeachers(List<Teacher> teachers) {
        System.out.println("Учителя:");
        for (int i = 0; i < teachers.size(); i++) {
            System.out.println((i + 1) + ": " + teachers.get(i));
        }
    }

    public void addTeacher() {
        System.out.println("Введите фамилию учителя:");
        String lastName = scanner.nextLine();
        System.out.println("Введите имя учителя:");
        String firstName = scanner.nextLine();
        System.out.println("Введите отчество учителя:");
        String middleName = scanner.nextLine();
        System.out.println("Введите предмет учителя:");
        String subject = scanner.nextLine();
        teacherController.createTeacher(lastName, firstName, middleName, subject);
        System.out.println("Учитель добавлен.");
    }

    public void editTeacher() {
        System.out.println("Введите номер учителя для редактирования:");
        int index = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера

        if (index < 1 || index > teacherController.getAllTeachers().size()) {
            System.out.println("Некорректный номер учителя.");
            return;
        }

        Teacher teacher = teacherController.getAllTeachers().get(index - 1);

        System.out.println("Текущие данные учителя:");
        System.out.println("Фамилия: " + teacher.getLastName());
        System.out.println("Имя: " + teacher.getFirstName());
        System.out.println("Отчество: " + teacher.getMiddleName());
        System.out.println("Предмет: " + teacher.getSubject());

        System.out.println("Введите новые данные учителя:");

        System.out.println("Введите новую фамилию учителя:");
        String newLastName = scanner.nextLine();
        System.out.println("Введите новое имя учителя:");
        String newFirstName = scanner.nextLine();
        System.out.println("Введите новое отчество учителя:");
        String newMiddleName = scanner.nextLine();
        System.out.println("Введите новый предмет учителя:");
        String newSubject = scanner.nextLine();

        teacherController.updateTeacher(teacher, newLastName, newFirstName, newMiddleName, newSubject);
        System.out.println("Учитель отредактирован.");
    }

    public void deleteTeacher() {
        System.out.println("Введите номер учителя для удаления:");
        int index = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера

        if (index < 1 || index > teacherController.getAllTeachers().size()) {
            System.out.println("Некорректный номер учителя.");
            return;
        }

        Teacher teacher = teacherController.getAllTeachers().get(index - 1);
        teacherController.deleteTeacher(teacher);
        System.out.println("Учитель удалён.");
    }
}