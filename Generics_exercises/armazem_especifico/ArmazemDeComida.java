import java.util.*;

public class ArmazemDeComida extends Armazem<Comida>{
    Map<String, Comida> comidas = new HashMap<>();

    public void adicionarAoInventario(String nome, Comida comida) {
        comidas.put(nome, comida);
    }
    public Comida obterDoInventario(String nome) {
        return comidas.get(nome);
    }
}