import humor.*;
import comida.*;

public class Personagem {
    private int pontosDeFelicidade = 0;

    public Humor obterHumorAtual() {
        Humor humor;
        if (this.pontosDeFelicidade < -5) humor = new Irritado();
        else if (this.pontosDeFelicidade >= -5 && this.pontosDeFelicidade <= 0) humor = new Triste();
        else if (this.pontosDeFelicidade >= 1 && this.pontosDeFelicidade <= 15) humor = new Feliz();
        else  humor = new MuitoFeliz();
        return humor;
    }

    public void comer(Comida[] comidas) {
        for (Comida comida : comidas) {
            this.pontosDeFelicidade += comida.getPontosDeFelicidade();
        }
    }

    @Override
    public String toString() {
        return "" + this.pontosDeFelicidade+" - " + obterHumorAtual().getClass().getSimpleName();
    }
}