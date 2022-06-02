import java.util.*;

public class Biblioteca <T extends Midia> {
    private List<T> valores = new ArrayList<>();

    public void adicionarMidia(T midia) {
        this.valores.add(midia);
    }

    public List<T> obterListaMidias() {
        return this.valores;
    }
}