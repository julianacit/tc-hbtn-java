import java.util.*;

public class Telefone implements Comparable<Telefone>{
    private String codigoArea;
    private String numero;

    public Telefone(String codigoArea, String numero) {
        this.codigoArea = codigoArea;
        this.numero = numero;
    }

    public String getCodigoArea() {
        return codigoArea;
    }

    public String getNumero() {
        return numero;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "(" + this.codigoArea + ") " + this.numero;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Telefone telefone = (Telefone) object;
        return java.util.Objects.equals(codigoArea, telefone.codigoArea) && java.util.Objects.equals(numero, telefone.numero);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + codigoArea.hashCode();
        result = 31 * result + numero.hashCode();
        return result;
    }

    @Override
    public int compareTo(Telefone tel) {
        int compareCod = codigoArea.compareTo(tel.getCodigoArea());

        if (compareCod == 0) {
            return numero.compareTo(tel.getNumero());
        }
        else return compareCod;
    }
}