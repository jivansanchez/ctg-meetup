package others.inhetitancevscomposition.inheritance;

public abstract class RootLooger {

    protected abstract void log();

    protected abstract void configureLoggerData();

    protected void connectToLoggerPlatforms() {
        System.out.println("Connecting logger Platform");
    }
}
