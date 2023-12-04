/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Lab8Bai2 {
    public static void main(String[] args) {
        ArrayList<Integer> myarrr = new ArrayList<Integer>();
        for (int i = 1; i < 11; i++) {
               myarrr.add(i);
        }
        for (int i = 1; i < 10; i++) {
            System.out.println(myarrr.get(i));
        }
    }
}
