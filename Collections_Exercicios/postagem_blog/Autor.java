public class Autor implements Comparable<Autor>{
    private String nome;
    private String sobrenome;

    public Autor(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return this.nome + " " + this.sobrenome;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Autor autor = (Autor) object;
        return java.util.Objects.equals(nome, autor.nome) && java.util.Objects.equals(sobrenome, autor.sobrenome);
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + nome.hashCode();
        result = 31 * result + sobrenome.hashCode();
        return result;
    }

    @Override
    public int compareTo(Autor autor) {
        String nomeCompleto = this.toString();
        return nomeCompleto.compareTo(autor.toString());
    }
}