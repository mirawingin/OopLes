package Lesson3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<LearningGroup> {
    private List<LearningGroup> groups;

    public Stream() {
        this.groups = new ArrayList<>();
    }

    public void addGroup(LearningGroup group) {
        groups.add(group);
    }

    public List<LearningGroup> getGroups() {
        return groups;
    }

    @Override
    public Iterator<LearningGroup> iterator() {
        return groups.iterator();
    }
}
