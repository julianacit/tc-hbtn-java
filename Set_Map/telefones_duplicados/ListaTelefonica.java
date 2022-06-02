import java.util.*;
import java.util.Map.Entry;

public class ListaTelefonica {
    private HashMap<String, HashSet<Telefone>> listaTelefonica;

    public ListaTelefonica() {
        this.listaTelefonica = new HashMap<String, HashSet<Telefone>>();
    }

    public HashSet<Telefone> adicionarTelefone(String nome, Telefone telefone) {
        HashSet<Telefone> telefones = new HashSet<Telefone>();

        if (this.listaTelefonica.containsKey(nome)) {

            telefones = this.listaTelefonica.get(nome);
            if (telefones.contains(telefone))
                throw new RuntimeException("Telefone jah existente para essa pessoa");
        }

        for (String nomeExistente: this.listaTelefonica.keySet()) {
            HashSet<Telefone> telefones2 = this.listaTelefonica.get(nomeExistente);

            if (telefones2.contains(telefone))
                throw new RuntimeException("Telefone jah pertence a outra pessoa");

        }
        telefones.add(telefone);
        this.listaTelefonica.put(nome, telefones);
        return telefones;
    }

    public TreeSet<Telefone> buscar(String nome) {
        HashSet<Telefone> telefones = this.listaTelefonica.get(nome);
        if (telefones == null) return null;
        return new TreeSet<Telefone>(telefones);
    }
}