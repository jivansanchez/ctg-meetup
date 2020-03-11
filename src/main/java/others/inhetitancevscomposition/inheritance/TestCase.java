package others.inhetitancevscomposition.inheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class TestCase {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String logger = reader.readLine();

        Map<String, Logger> mapLogger = new HashMap<>();
        mapLogger.put("CN", new ConsoleLogger());
        mapLogger.put("XML", new XMLLogger());
        mapLogger.put("JSON", new JsonLogger());
        mapLogger.put("MAIL", new EmailLogger());

        Logger loggerOutput = mapLogger.get(logger);

        if (loggerOutput != null) {
            loggerOutput.log();
            loggerOutput.configureLoggerData();
        } else {
            System.out.println("No Logger Recognized");
        }
    }
}
