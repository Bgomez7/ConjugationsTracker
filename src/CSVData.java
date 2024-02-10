import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVData {
    //Array of all conjugation data
    public ArrayList<String[]> conjugations = new ArrayList<>();

    CSVData(String file) {
        //File Reader
        BufferedReader reader = null;
        String line = "";

        //Read in csv data
        try {
            reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                this.conjugations.add(row);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}