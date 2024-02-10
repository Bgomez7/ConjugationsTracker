import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //File Reader
        String file = "src\\FrenchConjugations.csv";
        BufferedReader reader = null;
        String line = "";

        //Read in csv data
        try {
            reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                for(String index : row) {
                    System.out.printf(",", index);
                }
                System.out.println();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            reader.close();
        }
    }
}