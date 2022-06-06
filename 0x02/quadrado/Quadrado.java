public class Quadrado {
    public static double area(double lado) throws IllegalArgumentException {
        if (lado < 1) {
            throw new IllegalArgumentException("Lado deve possuir valor positivo");
        }
        return lado*lado;
    }
}