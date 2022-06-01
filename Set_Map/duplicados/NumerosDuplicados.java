import java.util.*;
import java.util.stream.*;

public class NumerosDuplicados {
    public static TreeSet<Integer> buscar(int[] numeros) {
        TreeSet<Integer> duplicados = new TreeSet<Integer>();
        HashSet<Integer> conjunto = new HashSet<Integer>();
        for (int i = 0; i < numeros.length; i++) {
            if (!conjunto.add(numeros[i]))
                duplicados.add(numeros[i]);
        }

        return duplicados;
    }
}