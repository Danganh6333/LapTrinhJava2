/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab5;

/**
 *
 * @author Admin
 */
public class XFileDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte[] data = XFile.read("D:/MOB1023/JavaApplication18/a.gif");
        XFile.write("D:/MOB1023/JavaApplication18/b.gif", data);
    }
    
}
