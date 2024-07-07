package Lesson4.controller;

import Lesson4.model.Student;
import Lesson4.model.StudyGroup;
import Lesson4.model.Teacher;
import Lesson4.service.StudyGroupService;
import Lesson4.view.StudyGroupView;

import java.util.List;

public class StudyGroupController {
    private StudyGroupService studyGroupService;
    private StudyGroupView studyGroupView;

    public StudyGroupController(StudyGroupService studyGroupService, StudyGroupView studyGroupView) {
        this.studyGroupService = studyGroupService;
        this.studyGroupView = studyGroupView;
    }

    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {
        return studyGroupService.createStudyGroup(teacher, students);
    }

    public void createAndDisplayStudyGroup(Teacher teacher, List<Student> students) {
        StudyGroup studyGroup = createStudyGroup(teacher, students);
        studyGroupView.displayStudyGroup(studyGroup);
    }
}
