package produtos;

public abstract class Produto {
    protected String titulo;
    protected int ano;
    protected double precoBruto;

    public Produto(String titulo, int ano, String pais, double precoBruto) {
        this.titulo = titulo;
        this.ano = ano;
        this.precoBruto = precoBruto;
    }

    public abstract double obterPrecoLiquido();
}