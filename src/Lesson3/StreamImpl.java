package Lesson3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StreamImpl implements Stream {
    private List<LearningGroup> groups;

    public StreamImpl() {
        this.groups = new ArrayList<>();
    }

    @Override
    public void addGroup(LearningGroup group) {
        groups.add(group);
    }

    @Override
    public Iterator<LearningGroup> iterator() {
        return groups.iterator();
    }

    @Override
    public int getGroupCount() {
        return groups.size();
    }

    public List<LearningGroup> getGroups() {
        return groups;
    }
}
