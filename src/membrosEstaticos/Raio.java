package membrosEstaticos;
import java.util.Locale;
import java.util.Scanner;

import membrosEstaticos.util.Calculator;

public class Raio {

   //public static final double PI = 3.14159; // final = constantes (Padrao de nome com Letra maiuscula e se preciso usar _)
    public static void main(String[] args) {
        
        Calculator calc = new Calculator();
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Radius: ");
        double radius = sc.nextDouble();

        double c = calc.circumfererence(radius);

        double v = calc.volume(radius);

        System.out.println("Circumference:  " + c);
        System.out.println("Volume:  " + v);
        System.out.println(calc.PI);

    }

   /*  public static double circumfererence(double radius) { //Se apagarmos o static nao funcionará pois o método main é static
                                                          // Nao se pode chamar um método que nao seja static dentro de um static
        return 2 * PI * radius;
    }

    public static double volume(double radius) {
        return  4 * PI * radius * radius * radius / 3.0;
    } */
}
