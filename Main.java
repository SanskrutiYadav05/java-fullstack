package student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
        StudentOperations ops = new StudentOperations(); //create a obj of studentOperation class
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Student Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. Show Students");
            System.out.println("3. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Email: ");
                String email = sc.nextLine();
                
                Student student = new Student(id, name, email);  //create a student class object
                ops.addStudent(student);
            } else if (choice == 2) {
                ops.showStudents();
            } else if (choice == 3) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}
