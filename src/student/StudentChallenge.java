package student;

import java.util.Scanner;

public class StudentChallenge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Enther the student's name: ");

        student.name = sc.nextLine();

        System.out.println("Enter the student's first grade: ");
        student.nota1 = sc.nextInt();

        System.out.println("Enter the student's second grade: ");
        student.nota2 = sc.nextInt();

        System.out.println("Enter the student's third grade: ");
        student.nota3 = sc.nextInt();

        System.out.println(student.pass());

        System.out.println("The Student Needs" + student.required());
    }
}
