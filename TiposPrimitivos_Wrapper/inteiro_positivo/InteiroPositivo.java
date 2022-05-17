//Na parte do Program deveria ser verificado se o objeto foi de fato criado (isEmpty), já que se não, o setValor não funcionará (Fail Fast)
//Continua o fluxo do programa com valores nulos, o que gera erros
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
        if (valor > -1) { //Teste não envolve verificação de inteiros pois não irá compilar caso ocorra, já que não existe construtor para double, apenas int
            this.valor = valor;
        }
        else {
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
    }
}