public class PersonagemGame {
    private int saudeAtual;
    private String nome;
    private String status;

    public PersonagemGame (int saudeInicial, String nome) {
        setSaudeAtual(saudeInicial);
        setNome(nome);
    }

    public String getStatus() {
        return status;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
        this.status = (this.saudeAtual > 0 ? "vivo" : "morto");
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setNome(String nome) {
        if (nome != null && !(nome.isBlank())) this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void tomarDano (int quantidadeDeDano) {
        if ((this.saudeAtual - quantidadeDeDano) < 0 ) {
            setSaudeAtual(0);
        }
        else {
            setSaudeAtual(this.saudeAtual - quantidadeDeDano);
        }
    }

    public void receberCura (int quantidadeDeCura) {
        if ((this.saudeAtual + quantidadeDeCura) > 100) {
            setSaudeAtual(100);
        }
        else {
            setSaudeAtual(this.saudeAtual + quantidadeDeCura);
        }
    }
}