/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ObjectOutputStreamDemo {

    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj_file_output.dat"));

        Product product = new Product();
        List<Product> l = new ArrayList<>();
        l.add(new Product("Product 1", 11.4, 300));
        l.add(new Product("Product 2", 12.4, 200));
        l.add(new Product("Product 3", 10.4, 100));
        l.add(new Product("Product 4", 9.4, 200));
    }
}
