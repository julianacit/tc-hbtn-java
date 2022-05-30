import java.util.*;

public class Pedido {
    private ArrayList<PedidoCookie> cookies;

    public Pedido() {
        this.cookies = new ArrayList<PedidoCookie>();
    }

    public void adicionarPedidoCookie (PedidoCookie cookie) {
        this.cookies.add(cookie);
    }

    public int obterTotalCaixas () {
        int quantidade = 0;
        for (PedidoCookie cookie: cookies) {
            quantidade += cookie.getQuantidadeCaixas();
        }
        return quantidade;
    }

    public int removerSabor (String sabor) {
        int quantidadeCookies = 0;
        Iterator<PedidoCookie> it = cookies.iterator();
        while (it.hasNext()) {
            PedidoCookie cookie = it.next();
            if (cookie.getSabor().equals(sabor)) {
                quantidadeCookies += cookie.getQuantidadeCaixas();
                it.remove();
            }
        }
        return quantidadeCookies;
    }
}