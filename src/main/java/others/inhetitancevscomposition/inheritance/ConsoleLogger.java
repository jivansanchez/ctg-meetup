package others.inhetitancevscomposition.inheritance;

public class ConsoleLogger extends Logger {

    @Override
    protected void log() {
        System.out.println("Logging To Console");
    }

    @Override
    protected void configureLoggerData() {
        throw new IllegalStateException("Not Implemented");
    }
}
