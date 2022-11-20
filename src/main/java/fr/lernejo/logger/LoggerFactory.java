package fr.lernejo.logger;

public class LoggerFactory implements Logger{
    public Logger getLogger(String name) {
        return this;
    }
    public void log(String message){
        System.out.println(message);
        return;
    }
}
