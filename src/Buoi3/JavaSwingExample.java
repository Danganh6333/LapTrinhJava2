/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi3;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class JavaSwingExample extends JFrame {

    public static void main(String[] args) {
        JFrame jf = new JFrame("Jframe");
        jf.setTitle("Example");
        
        jf.setSize(800,900);
        jf.setLayout(null);
        jf.setVisible(true);
        
        JLabel jLabel = new JLabel("Label");
        jLabel.setBounds(30, 60,100, 20);
        jf.add(jLabel);
        
        JTextField field = new JTextField();
        field.setBounds(68, 60, 300, 20);
        jf.add(field);
    }
}
