package Lesson4.view;

import Lesson4.model.StudyGroup;

public class StudyGroupView {
    public void displayStudyGroup(StudyGroup studyGroup) {
        System.out.println("Учебная группа:");
        System.out.println("Преподаватель: " + studyGroup.getTeacher());
        System.out.println("Студенты:");
        for (int i = 0; i < studyGroup.getStudents().size(); i++) {
            System.out.println((i + 1) + ": " + studyGroup.getStudents().get(i));
        }
    }
}