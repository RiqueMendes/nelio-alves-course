package application;

import java.util.Locale;
import java.util.Scanner;

import triangleChallenge.Triangle;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Triangle x, y;
        Scanner sc = new Scanner(System.in);
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();

        double areaY = y.area();

        System.out.println("The area of triangle X is " + areaX);
        System.out.println("The area of triangle Y is " + areaY);

        if (areaX > areaY) {
            System.out.println("The area of triangle X is greater than the area of triangle Y");
        } else {
            System.out.println("The area of triangle Y is greater than the area of triangle X");

        }
        sc.close();
    }

}
