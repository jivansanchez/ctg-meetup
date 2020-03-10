package others.programinginterface.better;

import others.programinginterface.goodcase.Television;
import others.programinginterface.goodcase.Device;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class TestCase {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String device = reader.readLine();

        Map<String, Device> mapDevices = new HashMap<>();
        mapDevices.put("TV", new Television());
        mapDevices.put("PR", new Television());
        mapDevices.put("CP", new Television());

        Device deviceOutput = mapDevices.get(device);

        if (deviceOutput != null) {
            deviceOutput.project();
        } else {
            System.out.println("There is not Device registered");
        }
    }

}
