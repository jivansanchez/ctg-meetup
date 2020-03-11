package others.inhetitancevscomposition.composition;

public class EmailLogger implements Logger {

    @Override
    public void log() {
        System.out.println("Logging to Emails");
    }

}
