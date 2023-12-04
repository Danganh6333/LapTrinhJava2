/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6;

/**
 *
 * @author Admin
 */
public class MyThread implements Runnable{
private int priority;

    public MyThread(int priority) {
        this.priority = priority;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
        
            }
        }
        System.out.println("\nThành Công");
    }
    public static void main(String[] args) {
        MyThread Thread1 = new MyThread(Thread.MAX_PRIORITY);
        MyThread Thread2 = new MyThread(Thread.MIN_PRIORITY);
        
        Thread t1 = new Thread(Thread1);
        Thread t2 = new Thread(Thread2);
        t1.start();
        t2.start();
    }
}

