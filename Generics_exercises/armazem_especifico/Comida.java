public class Comida {
    private String nome;
    private int calorias;
    private Double preco;

    public Comida(String nome, int calorias, Double preco) {
        this.nome = nome;
        this.calorias = calorias;
        this.preco = preco;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return String.format("[%s] %.6f R$ %.6f", this.nome, (double)this.calorias, this.preco);
    }
}