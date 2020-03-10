package others.programinginterface.badcase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestCase {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String device = reader.readLine();

        if (device != null && device.equals("TV")) {
            Television television = new Television();
            television.project();
        } else if (device != null && device.equals("PR")) {
            Projector projector = new Projector();
            projector.project();
        } else if (device != null && device.equals("CP")) {
            Computer computer = new Computer();
            computer.project();
        } else {
            System.out.println("There is not Device registered");
        }
    }
}
