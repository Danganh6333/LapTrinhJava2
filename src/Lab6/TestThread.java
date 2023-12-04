/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab6;

/**
 *
 * @author Admin
 */
public class TestThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();
        Thread t1 = new Thread(oddThread);
        Thread t2 = new Thread(evenThread);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
        }
        t2.start();
    }
    
}
