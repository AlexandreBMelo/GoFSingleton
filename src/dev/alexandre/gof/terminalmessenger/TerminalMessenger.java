package dev.alexandre.gof.terminalmessenger;

public class TerminalMessenger {
    // Instância única da classe TerminalMessenger
    private static TerminalMessenger instance;

    // Construtor que irá impedir que ele seja instânciado
    private TerminalMessenger() {
    }

    // Método público que irá forncer acesso à instância única
    public static TerminalMessenger getInstance() {
        if (instance == null) {
            instance = new TerminalMessenger();
        }
        return instance;
    }

    public void info(String message) {
        System.out.println("[INFO] " + message);
    }

    public void warning(String message){
        System.out.println("[WARNING] " + message);
    }

    public void error(String message){
        System.out.println("[ERROR] "+ message);
    }


}
