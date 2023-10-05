package membrosEstaticos.dollarExercise;

public class Dollar {
    public final double DOLLAR = 3.10;
    public final double IOF = 0.06;

    public double calcDolar(double value) {
        return value * DOLLAR;

    }

    public double calcDolarAfterIOF(double value) {
        return calcDolar(value) * IOF + value;

    }
}
