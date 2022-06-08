import java.util.*;

public class ConsultaProdutos {
    public static List<Produto> filtrar(List<Produto> produtos, CriterioFiltro criterioFiltro) {
        List<Produto> produtosFiltrados = new ArrayList<Produto>();
        produtos.forEach(produto -> {
            if (criterioFiltro.testar(produto)) {
                produtosFiltrados.add(produto);
            }
        });
        return produtosFiltrados;
    }
}