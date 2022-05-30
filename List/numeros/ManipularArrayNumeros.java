import java.util.*;

public class ManipularArrayNumeros {
    public static int buscarPosicaoNumero (List<Integer> lista, Integer numero) {
        return lista.indexOf(numero);
    }

    public static void adicionarNumero (List<Integer> lista, Integer numero) {
        if (buscarPosicaoNumero(lista, numero) != -1) throw new RuntimeException("Numero jah contido na lista");
        lista.add(numero);
    }

    public static void removerNumero (List<Integer> lista, Integer numero) {
        int indexNumero = buscarPosicaoNumero(lista, numero);
        if (indexNumero == -1) throw new RuntimeException("Numero nao encontrado na lista");
        lista.remove(indexNumero);
    }

    public static void substituirNumero (List<Integer> lista, Integer numeroSubstituir, Integer numeroSubstituto) {
        int indexNumero = buscarPosicaoNumero(lista, numeroSubstituir);
        if (indexNumero == -1) lista.add(numeroSubstituto);
        else lista.set(indexNumero, numeroSubstituto);
    }
}