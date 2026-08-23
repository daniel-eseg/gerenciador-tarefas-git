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

    public void adicionarTarefa(String tarefa){
        tarefas.add(tarefa);
        System.out.println("\nTarefa adicionada: "+tarefa);
    }


    // =========================================================
    // FEATURE B — REMOVER TAREFA
    // Integrante B deverá implementar sua funcionalidade aqui.
    // Sugestão de assinatura:
    //
    // public boolean removerTarefa(String tarefa)
    //
    // =========================================================
}
