import atividades.*;
import java.util.*;

public class Workflow {
    List<Atividade> atividadeList = new ArrayList<Atividade>();

    public void registrarAtividade(Atividade atividade) {
        atividadeList.add(atividade);
    }

    public List<Atividade> getAtividadeList() {
        return atividadeList;
    }
}