package main.queues;

import main.students.Gender;
import main.students.Student;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class TestMain {

    public static void main(String[] args) {
        Student student1 = new Student("Johnny", "Cash", Gender.MALE, "12345324", Arrays.asList(1.0, 2.0, 3.0));
        Student student2 = new Student("Tommy", "Iomi", Gender.MALE, "12345325", Arrays.asList(1.0, 3.0, 4.0));
        Student student3 = new Student("David", "Gilmour", Gender.MALE, "12345328", Arrays.asList(2.0, 5.0, 3.0));
        Student student4 = new Student("Barbra", "Strejsand", Gender.FEMALE, "12345366", Arrays.asList(5.0, 5.0, 5.0));
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        students.sort(new StudentComparator());
        System.out.println(students);

        LocalDate localDate1 =LocalDate.now();
        LocalDate localDate2 =LocalDate.now().plus(1,ChronoUnit.YEARS);
        LocalDate localDate3 =LocalDate.now().plus(2,ChronoUnit.YEARS);
        LocalDate localDate4 =LocalDate.now().minus(4,ChronoUnit.YEARS);

        List<LocalDate> localDateList = new ArrayList<>();
        localDateList.add(localDate1);
        localDateList.add(localDate2);
        localDateList.add(localDate3);
        localDateList.add(localDate4);
        System.out.println(localDateList);

        localDateList.sort(new LocalDateComparator());
        System.out.println(localDateList);


    }



}
