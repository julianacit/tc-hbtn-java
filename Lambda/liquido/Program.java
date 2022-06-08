import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Funcionario funcionario1 = new Funcionario(2360);

        double salarioLiquido90porcento = FolhaPagamento.calcularLiquido(funcionario1, x -> x * 0.9);
        double salarioLiquidoAcrescimo50 = FolhaPagamento.calcularLiquido(funcionario1, x -> x + 50);
        double salarioLiquidoAcrescimo10porcento = FolhaPagamento.calcularLiquido(funcionario1, x -> x * 1.1);

        System.out.printf("%.2f - %.2f\n", funcionario1.getSalario(), salarioLiquido90porcento);
        System.out.printf("%.2f - %.2f\n", funcionario1.getSalario(), salarioLiquidoAcrescimo50);
        System.out.printf("%.2f - %.2f\n", funcionario1.getSalario(), salarioLiquidoAcrescimo10porcento);
    }
}