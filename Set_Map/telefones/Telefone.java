public class Telefone {
    private String codigoArea;
    private String numero;

    public Telefone(String codigoArea, String numero) {
        this.codigoArea = codigoArea;
        this.numero = numero;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "(" + this.codigoArea + ") " + this.numero;
    }
}