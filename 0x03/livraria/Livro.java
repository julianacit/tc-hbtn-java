import exceptions.*;

public class Livro {
    private String titulo;
    private String autor;
    protected double preco;

    public Livro(String titulo, String autor, double preco) throws LivroInvalidoException, AutorInvalidoException{
        this.setAutor(autor);
        this.setPreco(preco);
        this.setTitulo(titulo);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) throws LivroInvalidoException {
        if (titulo.length() < 3) {
            throw new LivroInvalidoException("Titulo de livro invalido");
        }
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) throws AutorInvalidoException {
        String[] nomes = autor.split(" ");
        if (nomes.length <= 1) {
            throw new AutorInvalidoException("Nome de autor invalido");
        }
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) throws LivroInvalidoException{
        if (preco <= 0) {
            throw new LivroInvalidoException("Preco de livro invalido");
        }
        this.preco = preco;
    }


}