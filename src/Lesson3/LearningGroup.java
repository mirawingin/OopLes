package Lesson3;

public class LearningGroup {
    private String groupName;

    public LearningGroup(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public String toString() {
        return groupName;
    }
}
