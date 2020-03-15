package others.programinginterface.goodcase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BetterCase {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String device = reader.readLine();

        Device deviceOutput = getDevice(device);

        if (deviceOutput != null) {
            deviceOutput.project();
        }
    }

    public static Device getDevice(String deviceCode) {
        Map<String, Device> deviceMaps = new HashMap<>();
        deviceMaps.put("TV", new Television());
        deviceMaps.put("PR", new Projector());
        deviceMaps.put("CP", new Computer());

        return deviceMaps.get(deviceCode);
    }
}
