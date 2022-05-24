import java.util.*;
import java.text.*;
import produtos.*;

public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(int percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public void apresentarResumoPedido() {
        NumberFormat formatValor = NumberFormat.getInstance(new Locale("pt", "BR"));
        formatValor.setMaximumFractionDigits(2);
        System.out.println("------- RESUMO PEDIDO -------");
        double total = 0;
        for (ItemPedido item: itens) {
            Produto produto = item.getProduto();
            double valorTotalProduto = produto.obterPrecoLiquido() * item.getQuantidade();
            total += valorTotalProduto;
            System.out.printf("Tipo: %s Titulo: %s Preco: %s Quant: %d Total: %s%n",
                    produto.getClass().getSimpleName(), produto.getTitulo(), formatValor.format(produto.obterPrecoLiquido()),
                    item.getQuantidade(), formatValor.format(valorTotalProduto));
        }
        System.out.println("----------------------------");
        System.out.printf("DESCONTO: %s%n", formatValor.format(total*(this.percentualDesconto/100)));
        System.out.printf("TOTAL PRODUTOS: %s%n", formatValor.format(total));
        System.out.println("----------------------------");
        System.out.printf("TOTAL PEDIDO: %s%n", formatValor.format(total - (total*(this.percentualDesconto/100))));
        System.out.println("----------------------------");
    }

    public double calcularTotal () {
        double total = 0;
        for (ItemPedido item: itens) {
            total += item.getProduto().obterPrecoLiquido() * item.getQuantidade();
        }
        return total - (total*(this.percentualDesconto/100));
    }
}
