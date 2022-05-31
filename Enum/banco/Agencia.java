import java.util.*;

public class Agencia {
    private String nome;
    private ArrayList<Cliente> clientes;

    public Agencia(String nome) {
        this.nome = nome;
        clientes = new ArrayList<Cliente>();
    }

    public String getNome() {
        return nome;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public boolean novoCliente(String nomeCliente, double valor) {
        if (buscarCliente(nomeCliente) != null) return false;
        clientes.add(new Cliente(nomeCliente, valor));
        return true;
    }

    public boolean adicionarTransacaoCliente(String nomeCliente, double valor) {
        Cliente cliente = buscarCliente(nomeCliente);
        if (cliente == null) return false;
        cliente.adicionarTransacao(valor);
        return true;
    }

    public Cliente buscarCliente(String nome) {
        for (Cliente cliente: clientes) {
            if(cliente.getNome().equals(nome)) return cliente;
        }
        return null;
    }
}