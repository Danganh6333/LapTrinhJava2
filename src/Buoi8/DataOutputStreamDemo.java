/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi8;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Admin
 */
public class DataOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        final int Num = 5;
        DataOutputStream writer = new DataOutputStream(new FileOutputStream("data_file_otput.dat"));
        writer.writeInt(Num);
        for (int i = 0; i < Num; i++) {
            writer.writeInt(i);
        }
        writer.writeUTF("Xin chào");
        writer.writeDouble(6.5);
        writer.close();
    }
}
