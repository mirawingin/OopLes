package Lesson4.model;

public abstract class BaseModel {
    protected int id;
    protected String lastName;
    protected String firstName;
    protected String middleName;

    public BaseModel(int id, String lastName, String firstName, String middleName) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    @Override
    public String toString() {
        return id + ": " + lastName + " " + firstName + " " + middleName;
    }
}
