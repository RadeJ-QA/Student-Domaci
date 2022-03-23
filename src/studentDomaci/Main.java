package studentDomaci;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        boolean isRunning = true;

        while(isRunning){
            System.out.println("Please enter student's first name (or enter 'quit' to exit program): ");
            String firstName = scan.next();
            if(firstName.equalsIgnoreCase("quit")){
                break;
            }
            System.out.println("Please enter student's Last name: ");
            String lastName = scan.next();
            System.out.println("Please enter the grade the student received: ");
            while (!scan.hasNextInt()){
                scan.next();
                System.out.println("You need to enter a whole number in range 5-10");

            }
            int grade = scan.nextInt();
            Student s = new Student(firstName,lastName,grade);
            students.add(s);
        }

        System.out.println("All students on the exam: ");
        for (Student st:
             students) {
            System.out.println("Name: " + st.firstName + " " + st.lastName + " exam grade: " + st.grade);
        }

        System.out.println();
        System.out.println("Students that have passed the exam: ");
        for (Student st:
                students) {
            if (st.grade>5) {
                System.out.println("Name: " + st.firstName + " " + st.lastName + " exam grade: " + st.grade);
            }
        }







    }
}
