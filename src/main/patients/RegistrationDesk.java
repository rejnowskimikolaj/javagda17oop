package main.patients;

import java.util.*;

public class RegistrationDesk {
    private Map<String,Patient> patientMap;
    private Map<String,Visit> visitMap;
    private FileOperator fileOperator;
    private Queue<Patient> patientQueue;

    public RegistrationDesk() {
        visitMap = new HashMap<>();
        fileOperator = new FileOperator();
        patientMap = fileOperator.readPatients();
        patientQueue = new PriorityQueue<>(new PatientGenderComparator());
    }

    public boolean addPatient(Patient patient){

        if(patientMap.containsKey(patient.getId())){
            System.out.println("Patient exists!");
            return false;
        }

        patientMap.put(patient.getId(),patient);
        fileOperator.savePatients(patientMap);

        return false;
    }

    public boolean addPatientToQueue(Patient patient){
//        if(patientMap.containsKey(patient.getId())){
//            patientQueue.add(patient);
//            return true;
//        }
//        return false;
        patientQueue.add(patient);
        return true;
    }

    public Optional<Patient> getPatientFromQueue(){

        //zgrabniejsze:
//        return Optional.ofNullable(patientQueue.poll());
        Patient probablyPatient = patientQueue.poll();
        if(probablyPatient!=null) return Optional.of(probablyPatient);
        else return Optional.empty();
    }

    public Optional<String> register(Visit visit){
        if(visitMap.containsKey(visit.getId())) return Optional.empty();

        if(patientMap.containsKey(visit.getPatient().getId())){

            Patient realPatient = patientMap.get(visit.getPatient().getId());
            visit.setPatient(realPatient);

            visitMap.put(visit.getId(),visit);
            return Optional.ofNullable(visit.getId());
        }
        else return Optional.empty();
    }

    public void printPatients(){
        System.out.println(patientMap);
    }

    public void printVisits(){
        System.out.println(visitMap);
    }
}
