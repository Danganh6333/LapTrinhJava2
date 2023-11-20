/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi8;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Admin
 */
public class DataInputStreamDemo {
    public static void main(String[] args) throws  IOException {
        DataInputStream reader = new DataInputStream(new FileInputStream("data_file_otput.dat"));
        int items = reader.readInt();
        System.out.println(items);
        
        for (int i = 0; i <= items; ++i) {
            int num = reader.readInt();
            System.out.println(num);
        }
        System.out.println(reader.readUTF());
        System.out.println(reader.readDouble());
        
        reader.close();
        
    }
}
