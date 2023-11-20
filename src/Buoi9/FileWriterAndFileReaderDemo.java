package Buoi9;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Admin
 */
public class FileWriterAndFileReaderDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter(new File("TEXT.txt"));
        fileWriter.write("IO with Text file\n");
        fileWriter.write("1st Line\n");
        fileWriter.write("2nd Line\n");
        fileWriter.write("3rd Line\n");
        fileWriter.close();
        
        FileReader fileReader = new FileReader(new File("TEXT.txt"));
        int ch = fileReader.read();
        while (ch !=-1) {            
            System.out.print((char) ch);
            ch = fileReader.read();
            
        }
        fileReader.close();
    }
}
