package others.inhetitancevscomposition.inheritance;

public class EmailLogger extends Logger {

    @Override
    protected void log() {
        System.out.println("Logging to Emails");
    }

    @Override
    protected void configureLoggerData() {
        System.out.println("Configuration Done");
    }
}
