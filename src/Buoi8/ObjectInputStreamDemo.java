/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ObjectInputStreamDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream reader = new ObjectInputStream(new FileInputStream("obj_output_stream.dat"));
        Object obj = reader.readObject();
        List<Product> l = (List<Product>) obj;
        for (Product arg : l  ) {
            System.out.println(arg);
        }
        reader.close();
    }
}
