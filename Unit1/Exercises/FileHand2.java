//Simple java program that reads data from one file and writes the data to another file.
package Unit1.Exercises;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHand2 {
    public static void main(String[] args) {
        try{
            File inputfile = new File("C:/Users/abi3c/Desktop/java 7th sem/Unit1/Exercises/input.txt");
            File outputfile = new File("C:/Users/abi3c/Desktop/java 7th sem/Unit1/Exercises/output.txt");
            
            FileReader in = new FileReader(inputfile);
            FileWriter out = new FileWriter(outputfile);

            int c;
            while((c = in.read()) != -1){
                out.write(c);
            }
            in.close();
            out.close();

            System.out.println("File copied succesffully");
        }catch(IOException e){
            System.err.println("Error: "+e.getMessage());
        }
    }
}
