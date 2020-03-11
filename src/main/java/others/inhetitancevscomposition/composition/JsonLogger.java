package others.inhetitancevscomposition.composition;

public class JsonLogger implements Logger {

    @Override
    public void log() {
        System.out.println("Logging To JSON Files");
    }
}
