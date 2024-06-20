package Lesson3;

import java.util.Iterator;

public interface Stream extends Iterable<LearningGroup> {
    void addGroup(LearningGroup group);
    Iterator<LearningGroup> iterator();
    int getGroupCount();
}
