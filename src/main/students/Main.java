package main.students;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Student student1 = new Student("Johnny","Cash",Gender.MALE,"12345324", Arrays.asList(1.0,2.0,3.0));
        Student student2 = new Student("Tommy","Iomi",Gender.MALE,"12345325", Arrays.asList(1.0,3.0,4.0));
        Student student3 = new Student("David","Gilmour",Gender.MALE,"12345328", Arrays.asList(2.0,5.0,3.0));
        Student student4 = new Student("Barbra","Strejsand",Gender.FEMALE,"12345366", Arrays.asList(5.0,5.0,5.0));
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);

        List<Student> students2 = new ArrayList<>();
        students2.add(student1);
        students2.add(student2);
        students2.add(student3);
        students2.add(student4);

        StudentBook studentBook = new StudentBook(students2);

        System.out.println("students:");
        studentBook.printStudents();

        System.out.println(studentBook.getStudent(student1.getId()));
        System.out.println(studentBook.getStudent("blabla"));

//        studentBook.removeStudent2("12345325");
        System.out.println("after deleting Tommy: ");
        studentBook.printStudents();

        System.out.println(studentBook.getStudentsAverage("12345324"));
        System.out.println(studentBook.getStudentsInDanger());



    }

}
