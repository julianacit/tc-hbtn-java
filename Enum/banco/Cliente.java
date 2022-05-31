import java.util.*;

public class Cliente {
    private String nome;
    private List<Double> transacoes;

    public Cliente(String nome, double transacaoInicial) {
        this.nome = nome;
        this.transacoes = new ArrayList<Double>();
        this.transacoes.add(transacaoInicial);
    }

    public String getNome() {
        return nome;
    }

    public List<Double> getTransacoes() {
        return transacoes;
    }

    public void adicionarTransacao(double transacao) {
        this.transacoes.add(transacao);
    }
}