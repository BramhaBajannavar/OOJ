import java.util.Scanner;

public class Student {
    String name;
    String Usn;
    int n;
    int [] marks;
    int [] credits;

    Student(){
        this.name = "";
        this.Usn = "";
    }

    void display(){
        System.out.println("Name : " +name);
        System.out.println("USN : "+ Usn);
        System.out.println("Marks: ");
        for (int i=0; i< marks.length; ++i) System.out.println(marks[i]);
        for (int i=0; i< credits.length; ++i) System.out.println(credits[i]);
        System.out.println("SGPA : "+SGPA());
    }

    double SGPA() {
        int totalMarks = 0, totalCredits = 0;
        for (int i = 0; i < n; ++i) {
            totalMarks += marks[i] * credits[i]; 
            totalCredits += credits[i]; 
        }
        return (double) totalMarks / (totalCredits*10);
    }

    void accept(){
        System.out.println("Enter name");
        Scanner cin = new Scanner(System.in);
        name = cin.nextLine();
        System.out.println("Enter USN");
        Usn = cin.nextLine();
        System.out.println("Enter number of subjects");
        int n = cin.nextInt();
	    marks = new int[n];
	    credits = new int[n];
        System.out.println("Enter their marks");
        for (int i=0;i<n;++i) marks[i] = cin.nextInt();
        System.out.println("enter their credits");
        for (int i=0; i< n;++i) credits[i] = cin.nextInt();
    }

    public static void main(String[] args){
        System.out.println("Name: Bramha Anilkumar Bajannar");
        System.out.println("USN : 1BM23CS071");
        Student stud1 = new Student();
	    Student stud2 = new Student();
        stud1.accept();
        stud1.display();
	    stud2.accept();
        stud2.display();
    }
}
