public class Main {

    public static void main(String[] args) {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();

        System.out.println("Estado inicial do sistema:");
        gerenciador.listarTarefas();

        // =====================================================
        // TESTE DA FEATURE A — ADICIONAR TAREFA
        // Integrante A poderá testar sua funcionalidade aqui.
        // Exemplo, depois de implementar:
        //
        // gerenciador.adicionarTarefa("Revisar Pull Requests");
        //
        // =====================================================


        // =====================================================
        // TESTE DA FEATURE B — REMOVER TAREFA
        // Integrante B poderá testar sua funcionalidade aqui.
        // Exemplo, depois de implementar:
        //
        // gerenciador.removerTarefa("Estudar Git");
        //
        // =====================================================

        System.out.println("\nEstado final do sistema:");
        gerenciador.listarTarefas();
    }
}
