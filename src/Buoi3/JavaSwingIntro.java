/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Buoi3;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Admin
 */
public class JavaSwingIntro extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame jf = new JFrame("Jframe");
        
        JButton button = new JButton("Nhấn");
        button.setBounds(44,56,100,50);
        
        jf.add(button);
        jf.setSize(300,333);
        jf.setLayout(null);
        jf.setVisible(true);
    }
    
}
