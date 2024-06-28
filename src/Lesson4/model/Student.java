package Lesson4.model;

public class Student {
    private String lastName;
    private String firstName;
    private String middleName;
    private int id;
    private String subject;

    public Student(String lastName, String firstName, String middleName, int id, String subject) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.id = id;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + " " + middleName + " (ID: " + id + "), Предмет: " + subject;
    }
}
