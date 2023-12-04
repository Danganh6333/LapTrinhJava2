/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi11;

/**
 *
 * @author Admin
 */
public class EnumDemo {

    public enum Mua {
        Xuan, Ha, Thu, Dong
    }

    public enum Day {
        MON, TUE, WED, THU, FRI, SAT, SUN
    }

    public static void main(String[] args) {
//        for (Mua value : Mua.values()) {
//            System.out.println(value);
//        }
//        System.out.println("Value of Xuan is: " + Mua.valueOf("Xuan"));
        Day day = Day.FRI;
        switch (day) {
            case SUN:
                System.out.println("Monday");
                break;
            case MON:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Other days");;
        }
    }

}
