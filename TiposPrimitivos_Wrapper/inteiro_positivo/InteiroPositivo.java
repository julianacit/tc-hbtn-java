public class InteiroPositivo {
    private int valor;

    public InteiroPositivo (int valor) {
        verificacaoPositivo(valor);
    }

    public InteiroPositivo (String valor) {
        try {
            int stringChecker = Integer.parseInt(valor);
            verificacaoPositivo(stringChecker);
        }
        catch (Exception ex) {
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
    }

    public int getValor () {
        return valor;
    }
    public void setValor (int valor) {
        verificacaoPositivo(valor);
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

    private void verificacaoPositivo (int valor) {
        if (valor > -1 && (int)valor == valor) {
            this.valor = valor;
        }
        else {
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
    }
}