public class Main {

    public static void main(String[] args) {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();

        System.out.println("Estado inicial do sistema:");
        gerenciador.listarTarefas();

        gerenciador.adicionarTarefa("Revisar Pull Requests");
        gerenciador.adicionarTarefa("Commit final das alterações");
        gerenciador.adicionarTarefa("Orar para que não quebre a aplicação");


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
