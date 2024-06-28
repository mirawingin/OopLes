package Lesson4.model;

public class Teacher extends User {
    private String subject;

    public Teacher(String lastName, String firstName, String middleName, String subject) {
        super(lastName, firstName, middleName);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return getLastName() + " " + getFirstName() + " " + getMiddleName() + ", Предмет: " + subject;
    }
}
