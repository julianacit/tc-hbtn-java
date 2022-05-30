import java.util.*;

public class ListaTodo {
    private List<Tarefa> tarefas;

    public ListaTodo() {
        this.tarefas = new ArrayList<Tarefa>(0);
    }

    public void adicionarTarefa(Tarefa tarefa) {
        int identificador = tarefa.getIdentificador();
        tarefas.stream().forEach(t -> {
            if (tarefa.getIdentificador() == t.getIdentificador()) throw new IllegalArgumentException("Tarefa com identificador " + identificador + " ja existente na lista");
        });
        tarefas.add(tarefa);
    }

    public boolean marcarTarefaFeita(int identificador) {
        for (Tarefa tarefa: tarefas) {
            if (tarefa.getIdentificador() == identificador) {
                tarefa.setEstahFeita(true);
                return true;
            }
        }
        return false;
    }

    public boolean desfazerTarefa(int identificador) {
        for (Tarefa tarefa: tarefas) {
            if (tarefa.getIdentificador() == identificador) {
                tarefa.setEstahFeita(true);
                return true;
            }
        }
        return false;
    }

    public void desfazerTodas() {
        tarefas.stream().forEach(tarefa -> tarefa.setEstahFeita(false));
    }

    public void fazerTodas() {
        tarefas.stream().forEach(tarefa -> tarefa.setEstahFeita(true));
    }

    public void listarTarefas() {
        tarefas.stream().forEach(tarefa -> {
            if (tarefa.isEstahFeita()) System.out.println("[X]  Id: " + tarefa.getIdentificador() + " - Descricao: " + tarefa.getDescricao());
            else System.out.println("[ ]  Id: " + tarefa.getIdentificador() + " - Descricao: " + tarefa.getDescricao());
        });
    }
}