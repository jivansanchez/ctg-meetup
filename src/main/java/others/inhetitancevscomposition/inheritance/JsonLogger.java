package others.inhetitancevscomposition.inheritance;

public class JsonLogger extends Logger {

    @Override
    protected void log() {
        System.out.println("Logging To JSON Files");
    }

    @Override
    protected void configureLoggerData() {
        throw new IllegalStateException("Not Implemented");
    }
}
