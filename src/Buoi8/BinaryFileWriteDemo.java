package Buoi8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 *
 * @author Admin
 */
public class BinaryFileWriteDemo {
    //Writing to Binary file
    
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("b_file_output.dat");
            String s = "Some dummy text";
            fos.write(s.getBytes());
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
                throw new RuntimeException(ex);
        }finally{
            try {
                fos.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    
    
}
