package main.queues;

import main.patients.Patient;
import main.students.Gender;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompartorTest {


    public static void main(String[] args) {
        Patient patient1= new Patient("Johnny","Cash",Gender.MALE,423543);
        Patient patient2= new Patient("George","Michael",Gender.MALE,15);
        Patient patient3= new Patient("George2","Michael2",Gender.MALE,10);

        List<Patient> patientList = new ArrayList<>();
        patientList.add(patient1);
        patientList.add(patient2);
        patientList.add(patient3);
        System.out.println(patientList);
        Collections.sort(patientList,new MyPatientComparator());
        System.out.println(patientList);

        LocalDate localDate = LocalDate.now();

        LocalDate localDate2 = LocalDate.now().plus(2,ChronoUnit.YEARS);


        List<Integer> numbers = Arrays.asList(1,4,2,4,6,2,6,3,41,2,7,8,3,3);
       Collections.sort(numbers,new OddOrEvenComparator());
        System.out.println(numbers);


        Person person1 = new Person("Mickey","Rourke",LocalDate.now());
        Person person2 = new Person("Mickey","Mouse",LocalDate.now().plus(1,ChronoUnit.YEARS));
        Person person3 = new Person("Mickey","Zourke",LocalDate.now().minus(5,ChronoUnit.CENTURIES));
        Person person4 = new Person("Andrzej","Zourke",LocalDate.now().minus(5,ChronoUnit.CENTURIES));
        Person person5 = new Person("Borys","Zourke",LocalDate.now().minus(5,ChronoUnit.CENTURIES));

        List<Person> personList = Arrays.asList(person1,person2,person3,person4,person5);
        System.out.println(personList);
        Collections.sort(personList,new LastNameFirstNamePersonComparator());
        System.out.println(personList);
    }
}
