package main.patients;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;
import main.students.Gender;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileOperator {

    private final String PATIENTS_PATH= "src/main/patients/db/patients.txt";
    private final String SEPARATOR = ";";

    public void savePatients(Map<String,Patient> patientMap){

        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new BufferedWriter(new FileWriter(PATIENTS_PATH)));

            for (Patient patient : patientMap.values()) {

                writer.println(toLine(patient));
            }

            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Pliku nie znaleziono");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private String toLine(Patient patient){

        String result = "";
        result+=patient.getFirstName()+SEPARATOR;
        result+=patient.getLastName()+SEPARATOR;
        result+=patient.getGender()+SEPARATOR;
        result+=patient.getPhoneNumber()+SEPARATOR;
        result+=patient.getId();
        return result;
    }

    public Map<String,Patient> readPatients(){

        Map<String,Patient> patientMap = new HashMap<>();
        try {
            Scanner scanner = new Scanner(new File(PATIENTS_PATH));
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                Patient patient = toPatient(line);
                patientMap.put(patient.getId(),patient);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return patientMap;
    }

    private Patient toPatient(String line) {

        String[] fields = line.split(";");
        String firstName = fields[0];
        String lastName = fields[1];
        String genderString = fields[2];

        Gender gender;
        if(genderString.equals(Gender.MALE)){
            gender = Gender.MALE;
        }
        else if(genderString.equals(Gender.FEMALE)){
            gender = Gender.FEMALE;
        }else gender = Gender.OTHER;

        String numberString = fields[3];
        long number = Long.parseLong(numberString);
        String id =fields[4];

        Patient patient = new Patient(firstName,lastName,id,gender,number);
        return patient;

    }
}
