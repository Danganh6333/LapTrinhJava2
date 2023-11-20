/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Buoi9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class BufferedWriterAndBufferedReaderDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Text_file.txt"));
        bufferedWriter.write("Write to text file\n");
        List<Product> list = new ArrayList<>();
        list.add(new Product("Product 1", 2.4, 1000));
        list.add(new Product("Product 2", 9.7, 4000));
        list.add(new Product("Product 3", 2.2, 2000));
        list.add(new Product("Product 4", 7.2, 8000));
        for (Product product : list) {
            bufferedWriter.write(product.toString());
            bufferedWriter.newLine();
            
        }
        bufferedWriter.close();
        
        BufferedReader bufferedReader = new BufferedReader(new FileReader("Text_file.txt"));
        String text; 
        while ((text = bufferedReader.readLine()) !=null) {            
            System.out.println(text);
        }
        bufferedReader.close();
    }

}
