package OOPS.new1.Student_Management_System;

import java.util.*;

class Student {
    private final String name;
    private final int rollNumber;
    private final double marks;

    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public double getMarks() {
        return marks;
    }

    public void displayInfo(){
        System.out.println("Name: " + name + ", Roll no: " + rollNumber + ", Marks: " + marks);
    }
}

class SortByMarks implements Comparator <Student>{

    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.getMarks(), s1.getMarks());
    }
}

class SortByName implements Comparator <Student>{

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Sort Students by Marks");
            System.out.println("4. Sort Students by Name");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = 0;

            try{
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                sc.next();
                continue;
            }

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter Student Name: ");
                        String name = sc.next();
                        System.out.print("Enter Roll Number: ");
                        int rollNumber = sc.nextInt();
                        System.out.print("Enter Marks: ");
                        double marks = sc.nextDouble();

                        students.add(new Student(name, rollNumber, marks));
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid data format! Please try again.");
                        sc.next();
                    }
                    break;

                case 2:
                    if(students.isEmpty()) {
                        System.out.println("No students to display.");
                    } else {
                        for (Student student : students) {
                            student.displayInfo();
                        }
                    }
                    break;

                case 3:
                    students.sort(new SortByMarks());
                    System.out.println("Students sorted by marks: ");
                    for (Student student : students) {
                        student.displayInfo();
                    }
                    break;

                case 4:
                    students.sort(new SortByName());
                    System.out.println("Students sorted by name: ");
                    for (Student student : students) {
                        student.displayInfo();
                    }
                    break;

                case 5:
                    System.out.println("Exiting.....");
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
