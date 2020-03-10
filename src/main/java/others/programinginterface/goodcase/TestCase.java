package others.programinginterface.goodcase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestCase {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String device = reader.readLine();

        Device deviceOutput = null;

        if (device != null && device.equals("TV")) {
            deviceOutput = new Television();
        } else if (device != null && device.equals("PR")) {
            deviceOutput = new Projector();
        } else if (device != null && device.equals("CP")) {
            deviceOutput = new Computer();
        } else {
            System.out.println("There is not Device registered");
        }

        if (deviceOutput != null) {
            deviceOutput.project();
        }
    }
}
