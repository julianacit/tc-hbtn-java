public class Contato {
    private String nome;
    private String numeroTelefone;
    private TipoNumero tipoNumero;

    public Contato(String nome, String numeroTelefone, TipoNumero tipoNumero) {
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
        this.tipoNumero = tipoNumero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public TipoNumero getTipoNumero() {
        return tipoNumero;
    }

    public void setTipoNumero(TipoNumero tipoNumero) {
        this.tipoNumero = tipoNumero;
    }
}