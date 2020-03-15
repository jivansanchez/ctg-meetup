package others.dry.additionalexample;

import java.io.BufferedReader;
import java.io.FileReader;

public class ValidateStudentGoodExample {

    public static void main(String[] args) {

        String [] fields = {"Id", "name", "surname", "address"};

        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("/opt/java/ctg-meetup/src/main/java/others/dry/additionalexample/students.txt"));
            String line = reader.readLine();
            while (line != null) {
                for (String field : fields) {
                    if (line != null && !line.contains(field)) {
                        throw new Exception(String.format("El campo %s no esta en el archivo de importacion", field));
                    }
                }
                line = reader.readLine();
            }
            System.out.println("Todo fue validado con exito");
        }catch (Exception ee) {
            ee.printStackTrace();
        }
    }
}
