package Lesson3;

public class LearningGroupImpl implements LearningGroup {
    private String groupName;

    public LearningGroupImpl(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String getGroupName() {
        return groupName;
    }

    @Override
    public String toString() {
        return groupName;
    }
}
