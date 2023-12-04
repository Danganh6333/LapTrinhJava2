/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi10;

/**
 *
 * @author Admin
 */
class Task1 extends Thread{
    public void run(){
       for (int i = 101; i <= 199; i++) {
            System.out.println(i+"");
        }
        System.out.println("Task 1 is completed"); 
    }
}
class Task2 implements Runnable{

    @Override
    public void run() {
        for (int i = 101; i <= 299; i++) {
            System.out.println(i+"");
        }
        System.out.println("Task 2 is completed");
    }
    
}
public class ThreadBasicsDemo {
    public static void main(String[] args) throws InterruptedException {
        //Task 1
        Task1 task1 = new Task1();
        task1.setPriority(10);
        task1.start();
        //Task 2
       Task2 task2 = new Task2();
       Thread threadTask2 = new Thread(task2);
       threadTask2.setPriority(1);
       threadTask2.start();
       //Task 3 chờ task 1 xong
       task1.join();
       threadTask2.join();
        //Task 3
        for (int i = 101; i <= 399; i++) {
            System.out.println(i+"");
        }
        System.out.println("Task 3 is complete");
    }
}
