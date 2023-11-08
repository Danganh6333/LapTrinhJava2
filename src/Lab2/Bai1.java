/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab2;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Admin
 */
public class Bai1 extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Staff Edition");
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        
        JLabel jLabel = new JLabel("Staff Edition");
        jLabel.setForeground(Color.BLUE);
        jLabel.setBounds(20, 30, 222, 80);
        frame.add(jLabel);
    }
    
}
