import java.util.*;
import java.text.*;
public class PrintFormatacaoNumeros {
    public static void main (String args[]) {
        float taxa = 0.2456f;
        float valor = 7654.321f;
        NumberFormat formatValor = NumberFormat.getInstance(new Locale("en", "US"));
        formatValor.setMaximumFractionDigits(2);
        System.out.printf("Valor: R$ %s%n", formatValor.format(valor));
        System.out.printf("Taxa: %.2f%%%n",taxa);
    }
}