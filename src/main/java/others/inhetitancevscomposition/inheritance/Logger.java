package others.inhetitancevscomposition.inheritance;

public abstract class Logger extends RootLooger {

    protected abstract void log();

    protected abstract void configureLoggerData();

    protected void defaultLogger() {
        System.out.println("Using default Logger");
    }
}
