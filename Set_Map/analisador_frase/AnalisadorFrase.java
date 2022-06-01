import java.util.*;

public class AnalisadorFrase {
    public static TreeMap<String, Integer> contagemPalavras(String frase) {
        TreeMap<String, Integer> contagem = new TreeMap<String, Integer>();
        frase = frase.toLowerCase().replaceAll("\\?","").replaceAll("\\.", "").replaceAll("\\!", "").replaceAll("  ", " ");
        List<String> palavras = new ArrayList<String>(List.of(frase.split(" ")));

        for (String palavra: palavras) {
            if (contagem.containsKey(palavra))
                contagem.put(palavra, contagem.get(palavra)+1);
            else
                contagem.put(palavra, 1);
        }

        return contagem;
    }
}