package membrosEstaticos.dollarExercise;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Dollar d1 = new Dollar();
        System.out.println("Enter value: ");
        double a = d1.calcDolar(sc.nextDouble());
        System.out.println("The value before IOF is: " + a);

        System.out.println("the value after IOF is: " + d1.calcDolarAfterIOF(a));

    }
}
