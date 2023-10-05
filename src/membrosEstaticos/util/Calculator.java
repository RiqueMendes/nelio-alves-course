package membrosEstaticos.util;

public class Calculator {
    public  final double PI = 3.14159; // final = constantes (Padrao de nome com Letra maiuscula e se preciso usar
                                             // _)

    public  double circumfererence(double radius) { // Se apagarmos o static nao funcionará pois o método main é
                                                          // static
        // Nao se pode chamar um método que nao seja static dentro de um static
        return 2 * PI * radius;
    }

    public  double volume(double radius) {
        return 4 * PI * radius * radius * radius / 3.0;
    }
}
