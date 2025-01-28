package HealthCareManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class HealthCareManagement {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Doctor> doctorList = new ArrayList<>();

    public static void main(String args[]){
        
        while (true) { 
            System.out.println("\n1. Add Doctor Details");
            System.out.println("2. Display Available Doctors");
            System.out.println("3. Edit Doctor Details");
            System.out.println("4. Remove Doctor from list");
            System.out.println("5. Exit");
            System.out.print("Choose your option : ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1 -> addDoctor();
                case 2 -> display();
                case 3 -> editDoctor();
                case 4 -> removeDoctor();
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid Choice");
            }
        }
    }

    private static void addDoctor(){
        System.out.print("Doctor ID : ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Doctor Name : ");
        String dName = scanner.nextLine();
        System.out.print("specialization : ");
        String sp = scanner.nextLine();
        System.out.print("Schdule Date : ");
        String date = scanner.nextLine();
        System.out.print("Schedule Time : ");
        String time = scanner.nextLine();

        doctorList.add(new Doctor(id, dName, sp, date, time));
        System.out.println("Employee Added Successfully..!");
    }

    private static void display(){
        if (doctorList.isEmpty()) {
            System.out.println("No Details in the Doctor list");
        } else {
            for(Doctor doc : doctorList){
                System.out.println(doc);
            }
        }
    }

    private static void editDoctor(){
        System.out.println("doctor ID to update data");
        int id = scanner.nextInt();
        scanner.nextLine();

        for(Doctor doc : doctorList){
            if (doc.getDoctorNumber() == id) {
                System.out.println("Enter new name (current Name is "+doc.getDoctorName()+") : ");
                String dName = scanner.nextLine();
                doc.setDoctorName(dName);

                System.out.println("Enter new schedule date (Now "+doc.getScheduleDate()+") : ");
                String date = scanner.nextLine();
                doc.setScheduleDate(date);

                System.out.println("Enter new schdule (Now "+doc.getScheduleTime()+") : ");
                String time = scanner.nextLine();
                doc.setScheduleTime(time);

                System.out.println("Updated successfully..!");
                return;
            } else {
                System.out.println("Not ID here..!");
            }
        }
    }

    private static void removeDoctor(){
        System.out.println("Delete Doctor ID to Remove: ");
        int id = scanner.nextInt();
        
        Doctor toRemove = null;
        for(Doctor doc : doctorList){
            if(doc.getDoctorNumber() == id){
                toRemove = doc;
                break;
            }
        }

        if (toRemove != null){
            doctorList.remove(toRemove);
            System.out.println("Remove to Doctor from List");
        } else {
            System.out.println("Not found here..!");
        }
    }
    
}
