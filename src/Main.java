public class Main {

    public static void main(String[] args) {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();

        System.out.println("Estado inicial do sistema:");
        gerenciador.listarTarefas();

        gerenciador.adicionarTarefa("Revisar Pull Requests");
        gerenciador.adicionarTarefa("Commit final das alterações");
        gerenciador.adicionarTarefa("Orar para que não quebre a aplicação");

        gerenciador.removerTarefa("Revisar Pull Requests");

        System.out.println("\nEstado final do sistema:");
        gerenciador.listarTarefas();
    }
}
