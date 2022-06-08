import java.util.*;
import java.util.function.*;

public class ConsultaProdutos {
    public static List<Produto> filtrar(List<Produto> produtos, Predicate<Produto> predicate) {
        List<Produto> produtosFiltrados = new ArrayList<Produto>();
        produtos.forEach(produto -> {
            if (predicate.test(produto)) {
                produtosFiltrados.add(produto);
            }
        });
        return produtosFiltrados;
    }
}