package Lesson4.model;

public class Teacher extends BaseModel {
    private String subject;

    public Teacher(int id, String lastName, String firstName, String middleName, String subject) {
        super(id, lastName, firstName, middleName);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return super.toString() + ", Предмет: " + subject;
    }
}