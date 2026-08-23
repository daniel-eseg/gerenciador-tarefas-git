import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas {

    private final List<String> tarefas = new ArrayList<>();

    public GerenciadorTarefas() {
        tarefas.add("Estudar Git");
        tarefas.add("Fazer exercício de branches");
    }

    public void listarTarefas() {
        System.out.println("=== TAREFAS ===");

        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }

        for (int i = 0; i < tarefas.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, tarefas.get(i));
        }
    }

    // =========================================================
    // FEATURE A — ADICIONAR TAREFA
    // Integrante A deverá implementar sua funcionalidade aqui.
    // Sugestão de assinatura:
    //
    // public void adicionarTarefa(String tarefa)
    //
    // =========================================================


    // =========================================================
    // FEATURE B — REMOVER TAREFA
    // Integrante B deverá implementar sua funcionalidade aqui.
    // Sugestão de assinatura:
    //
    // public boolean removerTarefa(String tarefa)
    //
    // =========================================================

    public boolean removerTarefa(String tarefa) {
        boolean tarefaRemovida = false;
        for (int i = 0; i < tarefas.size(); i++) {
            if (tarefas.get(i) == tarefa) {
                System.out.printf("%nTarefa removida: %s%n", tarefas.get(i));
                tarefas.remove(i);
                tarefaRemovida = true;
            }
        }

        return tarefaRemovida;
    }
}
