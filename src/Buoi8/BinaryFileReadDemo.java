package Buoi8;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Admin
 */
public class BinaryFileReadDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("b_file_output.dat");
        int c;
        while ((c = fis.read()) != -1)  {            
            System.out.print((char) c);
        }
        fis.close();
    }
}
