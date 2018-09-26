package main.students;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String firstName;
    private final String lastName;
    private final Gender gender;
    private final String id;
    private final List<Double> marks;

    public Student(String firstName, String lastName, Gender gender, String id, List<Double> marks) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.id = id;
        this.marks = marks;
    }

    public Student(String firstName, String lastName, Gender gender, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.id = id;
        this.marks = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public String getId() {
        return id;
    }

    public List<Double> getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", marks=" + marks +
                '}';
    }

}
