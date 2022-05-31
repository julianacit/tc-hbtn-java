import java.util.*;

public class Banco {
    private String nome;
    private List<Agencia> agencias;

    public Banco(String nome) {
        this.nome = nome;
        agencias = new ArrayList<Agencia>();
    }

    public Agencia buscarAgencia(String nome) {
        for (Agencia agencia: agencias) {
            if (agencia.getNome().equals(nome)) {
                return agencia;
            }
        }
        return null;
    }

    public boolean adicionarAgencia(String nome) {
        Agencia agencia = this.buscarAgencia(nome);
        if (agencia != null)
            return false;
        agencias.add(new Agencia(nome));
        return true;
    }

    public boolean adicionarCliente(String nomeAgencia, String nomeCliente, double valor) {
        Agencia agencia = this.buscarAgencia(nomeAgencia);
        if (agencia == null) return false;
        Cliente cliente = agencia.buscarCliente(nomeCliente);
        if (cliente != null) return false;
        agencia.novoCliente(nomeCliente, valor);
        return true;
    }

    public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeCliente, double valor) {
        Agencia agencia = this.buscarAgencia(nomeAgencia);
        if (agencia == null) return false;
        Cliente cliente = agencia.buscarCliente(nomeCliente);
        if (cliente == null) return false;
        cliente.adicionarTransacao(valor);
        return true;
    }

    public boolean listarClientes(String nomeAgencia, boolean imprimeTransacoes) {
        Agencia agencia = this.buscarAgencia(nomeAgencia);
        if (agencia == null) return false;
        List<Cliente> clientes = agencia.getClientes();
        if (imprimeTransacoes) {
            for (Cliente cliente: clientes) {
                System.out.println("Cliente: " + cliente.getNome() + " [" + (clientes.indexOf(cliente)+1) + "]");
                List<Double> transacoes = cliente.getTransacoes();
                for (Double transacao: transacoes) {
                    System.out.println("  [" + (transacoes.indexOf(transacao)+1) + "] valor " + transacao);
                }
            }
        }
        else {
            for (Cliente cliente: clientes)
                System.out.println("Cliente: " + cliente.getNome() + "[" + (clientes.indexOf(cliente)+1) + "]");
        }
        return true;
    }
}