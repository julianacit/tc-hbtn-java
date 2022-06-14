import java.util.*;
import java.util.stream.*;

public class ConsultaPessoas {
    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> pessoas) {
        TreeMap<String, TreeSet<Pessoa>> retorno = pessoas.stream()
                .collect(Collectors.groupingBy(
                        Pessoa::getCargo,
                        () -> new TreeMap<>(Collections.reverseOrder()),
                        Collectors.toCollection(TreeSet::new)
                ));
        return retorno;
    }
}