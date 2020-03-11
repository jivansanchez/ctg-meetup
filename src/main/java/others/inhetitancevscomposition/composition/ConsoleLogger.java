package others.inhetitancevscomposition.composition;


public class ConsoleLogger implements Logger {

    @Override
    public void log() {
        System.out.println("Logging To Console");
    }
}
