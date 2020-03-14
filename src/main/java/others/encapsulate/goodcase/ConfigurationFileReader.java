package others.encapsulate.goodcase;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ConfigurationFileReader {

    public Double getConfiguratinValue(String fieldName){
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("/opt/java/ctg-meetup/src/main/java/others/encapsulate/goodcase/configurationFile.txt"));
            String line = reader.readLine();
            while (line != null) {
                line = reader.readLine();
                if (line == null || !line.contains(fieldName)) {
                    continue;
                }
                String [] data = line.split("=");
                if (data.length == 2) {
                    return new Double(data[1]).doubleValue();
                } else {
                    return 0.0d;
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0.0d;
    }

    public Double getAdditionalValuees(){
        BufferedReader reader;
        Double finalAdditionals = 0.0d;
        try {
            reader = new BufferedReader(new FileReader("/opt/java/ctg-meetup/src/main/java/others/encapsulate/goodcase/configurationFile.txt"));
            String line = reader.readLine();
            while (line != null) {
                line = reader.readLine();
                if (line == null || !line.contains("additional")) {
                    continue;
                }
                String [] data = line.split("=");
                finalAdditionals = finalAdditionals + Double.valueOf(data[1]);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return finalAdditionals;
    }
}
