package main.queues;

import main.students.Gender;
import main.students.Student;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        if(student1.getGender().equals(Gender.FEMALE)&& student2.getGender().equals(Gender.MALE))return 1;
        if(student1.getGender().equals(Gender.MALE)&& student2.getGender().equals(Gender.FEMALE))return -1;
        return 0;
    }
}
