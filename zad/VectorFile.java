package zad;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Rafikus on 16.05.17.
 */
public class VectorFile {

    static void saveToFile(String FILENAME, Vector vector)
    {
        try
        {
            BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME + ".txt"));
            for(int i = 0; i < vector.getLength(); i++) {
                bw.append(vector.getArray()[i] + " ");
            }
            bw.close();
        }
        catch(IOException e)
        {
            System.out.println("Błąd zapisu do pliku!");
        }

    }

}
