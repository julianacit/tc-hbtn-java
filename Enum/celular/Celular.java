import java.util.*;

public class Celular {
    private List<Contato> contatos;

    public Celular() {
        contatos = new ArrayList<Contato>();
    }

    public int obterPosicaoContato(String nome) {
        for (Contato contato: contatos) {
            if (contato.getNome().equals(nome)) {
                return contatos.indexOf(contato);
            }
        }
        return -1;
    }

    public void adicionarContato(Contato contato) {
        if (obterPosicaoContato(contato.getNome())!= -1) throw new RuntimeException("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
        contatos.add(contato);
    }

    public void atualizarContato(Contato contatoAntigo, Contato novoContato) {
        int posicaoAntigo = obterPosicaoContato(contatoAntigo.getNome());
        if (posicaoAntigo == -1) throw new RuntimeException("Nao foi possivel modificar contato. Contato nao existe");
        if (!contatoAntigo.getNome().equals(novoContato.getNome()) && obterPosicaoContato(novoContato.getNome()) != -1) throw new RuntimeException("Nao foi possivel modificar contato. Contato jah existente com esse nome");
        contatos.set(posicaoAntigo, novoContato);
    }

    public void removerContato(Contato contato) {
        int posicaoContato = obterPosicaoContato(contato.getNome());
        if (posicaoContato == -1) throw new RuntimeException("Nao foi possivel remover contato. Contato nao existe");
        contatos.remove(posicaoContato);
    }

    public void listarContatos() {
        for (Contato contato: contatos) {
            System.out.println(contato.getNome() + " -> " + contato.getNumeroTelefone() + " (" + contato.getTipoNumero() + ")");
        }
    }
}