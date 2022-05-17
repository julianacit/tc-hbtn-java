public class InteiroPositivo {
    int valor ;

    public InteiroPositivo (int valor) {
        if (valor > -1) {
            this.valor = valor;
        }
        else {
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
    }
    public InteiroPositivo (String valor) {
        try {
            this.valor = Integer.parseInt(valor);
            if (this.valor < 0) {
                throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
            }
        }
        catch (Exception ex) {
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
    }

    public int getValor () {
        return valor;
    }
    public void setValor (int valor) {
        if (valor > -1) {
            this.valor = valor;
        }
        else {
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
    }

    public boolean ehPrimo () {
        if (valor == 1 || valor == 0) {
            return false;
        }
        for (int i = 2; i < valor; i++) {
            if (valor%i == 0) return false;
        }
        return true;
    }
}