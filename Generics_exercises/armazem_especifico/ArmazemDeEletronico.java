import java.util.*;

public class ArmazemDeEletronico extends Armazem<Eletronico>{
    Map<String, Eletronico> eletronicos = new HashMap<>();

    public void adicionarAoInventario(String nome, Eletronico eletronico) {
        eletronicos.put(nome, eletronico);
    }
    public Eletronico obterDoInventario(String nome) {
        return eletronicos.get(nome);
    }
}