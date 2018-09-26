package main.students;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentBook {

    private List<Student> studentList;

    public StudentBook(List<Student> studentList) {
        this.studentList = studentList;
    }

    public StudentBook() {
        studentList = new ArrayList<>();
    }

    public boolean addStudent(Student student) {
        studentList.add(student);
        return true;

    }

    public void removeStudent(String id) {

        Student studentToRemove = null;
        for (Student student : studentList) {

            if (student.getId().equals(id)) {
                studentToRemove = student;
            }
            break;
        }
        if (studentToRemove != null) {
            studentList.remove(studentToRemove);
        }
    }

    public void removeStudent(Student student) {
        studentList.remove(student);
    }

    public Optional<Student> getStudent(String id) {
        for (Student student : studentList) {

            if (student.getId().equals(id)) {
                return Optional.of(student);
            }
        }

        return Optional.empty();
    }
    public Optional<Student> getStudent2(String id) {

        for (Student student : studentList) {

            if (student.getId().equals(id)) {
                return Optional.of(student);
            }
        }

        return Optional.empty();
    }

    public void printStudents() {
        System.out.println(studentList);
    }

    public Optional<Double> getStudentsAverage(String id) {

        Optional<Student> studentOptional = getStudent(id);


        if (studentOptional.isPresent()) {

            Student student = studentOptional.get();
            double result = 0;
            for (Double mark : student.getMarks()) {

                result += mark;
            }

            if (studentList.size() > 0) result = result / studentList.size();

            return Optional.of(result);
        } else return Optional.empty();
    }

    public List<Student> getStudentsInDanger(){

        List<Student> result = new ArrayList<>();

        for (Student student : studentList) {
            Optional<Double> avfOptional = getStudentsAverage(student.getId());
            if(avfOptional.isPresent()){
                if(avfOptional.get()<3.0) result.add(student);
            }
        }
        return result;
    }
}
