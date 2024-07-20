package dev.alexandre.gof.terminalmessenger;
public class Main {
    public static void main(String[] args) {
        // Obtenha a instância única do TerminalMessenger
        TerminalMessenger messenger = TerminalMessenger.getInstance();

        // Envie mensagens de diferentes níveis de severidade
        messenger.info("Este é um log informativo.");
        messenger.warning("Este é um aviso.");
        messenger.error("Este é um erro.");

        // Tente obter outra instância do TerminalMessenger
        TerminalMessenger anotherMessenger = TerminalMessenger.getInstance();

        // Verifique se ambas as instâncias são iguais
        if (messenger == anotherMessenger) {
            System.out.println("Ambas as variáveis se referem à mesma instância.");
        } else {
            System.out.println("As variáveis referem-se a diferentes instâncias.");
        }
    }
}