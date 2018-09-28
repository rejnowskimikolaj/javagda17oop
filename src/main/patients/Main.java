package main.patients;

import main.students.Gender;
import main.students.Student;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
//    public static void main(String[] args) {
//
//        List<Student> list = new ArrayList<>();
//        Student student1 = new Student("Mikoaj","Rejnowski",Gender.MALE,"123",Collections.emptyList());
//        Student student2 = new Student("Andrzej","Rejnowski",Gender.MALE,"123",Collections.emptyList());
//
////        for (Student student : list) {
////            if (student.getId().equals("jakiesId")) ;
////        }
//
//
//        //z lewej strony interfejs: MAP
//        //z prawej strony implementacja interfejsu MAP: HASHMAP
//        Map<String, Student> map = new HashMap<>();
//
//        //wrzucamy pary: klucz-wartosc (id studenta i studenta)
//        map.put(student1.getId(),student1);
//        map.put(student2.getId(),student2);
//        //toString() dla map jest zaimplementowany w dogodny sposob
//        System.out.println(map);
//        //żeby wyciągnac studenta z mapy, musimy podac klucz (za pomoca metody get)
//         Student retrievedStudent = map.get("123");
//        System.out.println(retrievedStudent);
//
//        //jesli nie istnieje dany klucz, to get() zwroci nulla
//        Student retrievedStudent2 = map.get("nieistniejacy_klucz");
//        System.out.println(retrievedStudent);
//        //metoda zwracajaca seta z kluczami
//        Set<String> keys = map.keySet();
//
//        //epoch time
//        long milis = System.currentTimeMillis();
//        System.out.println(milis);
//
//        //localdate, localdatetime
//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime);
//
//        //formatter pozwala nam otrzymac reprezentacje daty jako string
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yy-MM-dd");
//        System.out.println(dateTimeFormatter.format(localDateTime));
//
//        //Instant - cos podobnego do currentTimeMillis
//        Instant instant = Instant.now();
//        instant.toEpochMilli();
//
//        final String uuid = UUID.randomUUID().toString();
//        System.out.println(uuid);
//
//        RegistrationDesk registrationDesk =new RegistrationDesk();
//
//    }

    public static void main(String[] args) {


//        registrationDesk.addPatient(patient1);
//        registrationDesk.addPatient(patient2);
//        registrationDesk.addPatient(patient3);
//        registrationDesk.addPatient(patient4);
//        registrationDesk.addPatient(patient4);
//
//        Visit visit1 = new Visit("10-04-2016",patient1,"Haus",650.0);
//        Visit visit2 = new Visit("10-04-2017",patient1,"Haus",650.0);
//        Visit visit3 = new Visit("10-05-2016",patient2,"Haus",230.77);
//        Visit visit4 = new Visit("10-06-2016",new Patient("","",patient4.getId(),null,3213),"Haus",650.11);
//
//        registrationDesk.register(visit1);
//        registrationDesk.register(visit2);
//        registrationDesk.register(visit3);
//        System.out.println(registrationDesk.register(visit4));
//        System.out.println(registrationDesk.register(visit4));
//
//        registrationDesk.printPatients();
//        registrationDesk.printVisits();
        Patient patient1= new Patient("Johnny","Cash",Gender.MALE,123);
        Patient patient2= new Patient("Cher","ButQuicker",Gender.FEMALE,532);
        Patient patient3= new Patient("George","Michael",Gender.MALE,2131);
        Patient patient4= new Patient("Ch","Er",Gender.FEMALE,532);
        Patient patient5= new Patient("Freddy","Mercury",Gender.MALE,5425);

        RegistrationDesk registrationDesk = new RegistrationDesk();

        registrationDesk.addPatientToQueue(patient1);
        registrationDesk.addPatientToQueue(patient2);
        registrationDesk.addPatientToQueue(patient3);
        registrationDesk.addPatientToQueue(patient4);
        registrationDesk.addPatientToQueue(patient5);

        for (int i = 0; i <6 ; i++) {
            System.out.println(registrationDesk.getPatientFromQueue());
        }

    }
}

