package main.patients;

import main.students.Gender;

import java.util.Comparator;

import static main.students.Gender.*;

public class PatientGenderComparator implements Comparator<Patient> {
    @Override
    public int compare(Patient p1, Patient p2) {

        if(p1.getGender()==FEMALE&&p2.getGender()==MALE) return -1;
        if(p1.getGender()==MALE&&p2.getGender()==FEMALE) return 1;
        return 0;
    }
}
