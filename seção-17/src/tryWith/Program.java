package tryWith;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

    public static void mins(String[] args) {

        String path = "C:\\Users\\supor\\Desktop\\Nova pasta\\Estudos-Java\\seção-17\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
