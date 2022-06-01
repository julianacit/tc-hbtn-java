import java.util.*;

public class ListaTelefonica {
    private HashMap<String, ArrayList<Telefone>> listaTelefonica;

    public ListaTelefonica() {
        this.listaTelefonica = new HashMap<String, ArrayList<Telefone>>();
    }

    public void adicionarTelefone(String nome, Telefone telefone) {
        ArrayList<Telefone> telefones = new ArrayList<Telefone>();
        if (this.listaTelefonica.containsKey(nome))
            telefones = listaTelefonica.get(nome);

        telefones.add(telefone);
        this.listaTelefonica.put(nome, telefones);

    }

    public ArrayList<Telefone> buscar(String nome) {
        return this.listaTelefonica.get(nome);
    }
}