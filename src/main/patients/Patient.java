package main.patients;

import main.students.Gender;

import java.util.Objects;
import java.util.UUID;

public class Patient {

    private String firstName;
    private String lastName;
    private String id;
    private Gender gender;
    private long phoneNumber;

    public Patient(String firstName, String lastName, Gender gender,long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        id= UUID.randomUUID().toString();
        this.phoneNumber = phoneNumber;
    }

    public Patient(String firstName, String lastName, String id, Gender gender, long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return id;
    }

    public Gender getGender() {
        return gender;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id='" + id + '\'' +
                ", gender=" + gender +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Objects.equals(firstName, patient.firstName) &&
                Objects.equals(lastName, patient.lastName) &&
                Objects.equals(id, patient.id) &&
                gender == patient.gender;
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstName, lastName, id, gender);
    }
}
