public class Eletronico {
    private String descricao;
    private double valor;

    public Eletronico(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return String.format("[%s] R$ %.6f", this.descricao, this.valor);
    }
}