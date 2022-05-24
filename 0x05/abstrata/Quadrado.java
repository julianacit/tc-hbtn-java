public class Quadrado extends Retangulo {
    private double lado;

    public String toString() {
        return String.format("[Quadrado] %.2f", this.lado);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if (lado < 0) throw new java.lang.IllegalArgumentException("Lado deve ser maior ou igual a 0");
        this.lado = lado;
        super.setLargura(lado);
        super.setAltura(lado);
    }
}