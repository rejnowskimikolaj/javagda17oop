package main.patients;

import java.util.Objects;
import java.util.UUID;

public class Visit {

    private String date;
    private Patient patient;
    private String doctor;
    private double price;
    private String id;

    public Visit(String date, Patient patient, String doctor, double price) {
        this.date = date;
        this.patient = patient;
        this.doctor = doctor;
        this.price = price;
        id= UUID.randomUUID().toString();
    }

    public String getDate() {
        return date;
    }

    public Patient getPatient() {
        return patient;
    }

    public String getDoctor() {
        return doctor;
    }

    public double getPrice() {
        return price;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "date='" + date + '\'' +
                ", patient=" + patient +
                ", doctor='" + doctor + '\'' +
                ", price=" + price +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Visit visit = (Visit) o;
        return Double.compare(visit.price, price) == 0 &&
                Objects.equals(date, visit.date) &&
                Objects.equals(patient, visit.patient) &&
                Objects.equals(doctor, visit.doctor) &&
                Objects.equals(id, visit.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(date, patient, doctor, price, id);
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
