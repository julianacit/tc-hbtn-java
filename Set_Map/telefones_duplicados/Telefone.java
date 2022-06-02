import java.util.*;

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
}