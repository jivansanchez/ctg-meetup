package others.dry.additionalexample;

import java.io.BufferedReader;
import java.io.FileReader;

public class ValidateStudentBadExample {

    public static void main(String[] args) {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("/opt/java/ctg-meetup/src/main/java/others/dry/additionalexample/students.txt"));
            String line = reader.readLine();
            while (line != null) {
                if (line != null && !line.contains("Id")) {
                    throw new Exception("El campo ID no esta en el archivo de importacion");
                }

                if (line != null && !line.contains("name")) {
                    throw new Exception("El campo name no esta en el archivo de importacion");
                }

                if (line != null && !line.contains("surname")) {
                    throw new Exception("El surname ID no esta en el archivo de importacion");
                }

                if (line != null && !line.contains("address")) {
                    throw new Exception("El address ID no esta en el archivo de importacion");
                }
                line = reader.readLine();
            }

            System.out.println("Todo fue validado con exito");
        }catch (Exception ee) {
            ee.printStackTrace();
        }
    }
}
