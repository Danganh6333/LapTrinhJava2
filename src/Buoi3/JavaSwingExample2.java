/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Buoi3;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class JavaSwingExample2 extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(600, 600);
        frame.setLayout(null);
        frame.setVisible(true);
        
        JLabel jLabel = new JLabel("Product Name: ");
        jLabel.setBounds(50, 100, 100, 20);
        frame.add(jLabel);
        
        JTextField jTextField = new JTextField();
        jTextField.setBounds(90, 100, 300, 20);
        frame.add(jTextField);
        
        JLabel label = new JLabel("Product Type: ");
        label.setBounds(50, 200, 100, 20);
        frame.add(label);
        
        JTextField jtf = new JTextField();
        jtf.setBounds(90, 200, 300, 20);
        frame.add(jtf);
    }
    
}
