import java.util.*;
import java.text.*;
public class PrintFormatacaoNumeros {
    public static void main (String args[]) {
        float taxa = 0.2456f;
        float valor = 7654.321f;
        Locale locale = new Locale("pt", "BR");
        NumberFormat formatValor = NumberFormat.getInstance(locale);
        formatValor.setMaximumFractionDigits(2);
        System.out.println("Valor: R$ " + formatValor.format(valor));
        System.out.printf("Taxa: %.2f%%%n",taxa);
    }
}
