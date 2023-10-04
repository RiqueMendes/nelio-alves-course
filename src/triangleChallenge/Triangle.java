package triangleChallenge;

public class Triangle {
    public double a; //atributos da classe (lados A, B, C)
    public double b;
    public double c;

    public double area() {
        double p = (a + b + c) / 2.0;
        return  Math.sqrt(p * (p - a) * (p - b) * (p - c));
      
    }
}
