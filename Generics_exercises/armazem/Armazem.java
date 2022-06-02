import java.util.*;

public class Armazem<U> implements Armazenavel<String, U>{
    Map<String, U> produtos = new HashMap<>();

    public void adicionarAoInventario(String nome, U valor) {
        produtos.put(nome, valor);
    }
    public U obterDoInventario(String nome) {
        return produtos.get(nome);
    }
}