package Lesson4.service;

import Lesson4.model.Group;
import Lesson4.model.Student;
import Lesson4.model.StudyGroup;
import Lesson4.model.Teacher;

import java.util.List;

public class StudyGroupService {
    public void createAndDisplayStudyGroup(Teacher teacher, Group group) {
        System.out.println("Создана учебная группа под руководством:");
        System.out.println(teacher.toString());
        System.out.println("Группа:");
        System.out.println(group.toString());
    }

    public StudyGroup createStudyGroup(Teacher teacherr, List<Student> students) {
        return null;
    }
}
