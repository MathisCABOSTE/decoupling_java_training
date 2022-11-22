package fr.lernejo.logger;

public class GameLogger implements Logger {
    public void log(String message) {
        System.out.println(message);
        return;
    }
}
