package CIE;

import java.util.Scanner;

public class Internals extends Student {
    public int[] marks = new int[5];

    public Internals(String usn, String name, int sem) {
        super(usn, name, sem);
    }

    public void getmarks() {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter internal marks for course " + (i + 1) + ":");
            marks[i] = s.nextInt();
            s.nextLine();
        }
    }

    public void displaymarks() {
        System.out.println("Internal Marks:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Course " + (i + 1) + ": " + marks[i]);
        }
    }
}



package CIE;

public class Student {
    public String usn;
    public String name;
    public int sem;

    public Student(String usn, String name, int sem) {
        this.usn = usn;
        this.name = name;
        this.sem = sem;
    }

    public void displayStudentInfo() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        System.out.println("Semester: " + sem);
    }
}



package SEE;

import CIE.Student;
import CIE.Internals;
import java.util.Scanner;

public class Externals extends Internals {
    public int[] extmarks = new int[5];

    public Externals(String usn, String name, int sem) {
        super(usn, name, sem);
    }

    public void getextmarks() {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter external marks for course " + (i + 1) + ":");
            extmarks[i] = s.nextInt();
            s.nextLine();
        }
    }

    public void displayextmarks() {
        System.out.println("External Marks:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Course " + (i + 1) + ": " + extmarks[i]);
        }
    }

    public void finalmarks() {
        System.out.println("Final Marks (Internal + External):");
        for (int i = 0; i < 5; i++) {
            int finalMark = marks[i] + extmarks[i];
            System.out.println("Course " + (i + 1) + ": " + finalMark);
        }
    }
}




import CIE.*;
import SEE.*;
import java.util.Scanner;

public class MainMarks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int n = s.nextInt();
        s.nextLine();
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1));
            System.out.print("Enter USN: ");
            String usn = s.nextLine();
            System.out.print("Enter Name: ");
            String name = s.nextLine();
            System.out.print("Enter Semester: ");
            int sem = s.nextInt();
            s.nextLine();
            
            Externals student = new Externals(usn, name, sem);
            
            // Display student details
            student.displayStudentInfo();
            
            // Get and display internal marks
            System.out.println("Enter internal marks:");
            student.getmarks();
            student.displaymarks();
            
            // Get and display external marks
            System.out.println("Enter external marks:");
            student.getextmarks();
            student.displayextmarks();
            
            // Calculate and display final marks
            student.finalmarks();
        }
        
        s.close();
    }
}
