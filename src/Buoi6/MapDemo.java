/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi6;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class MapDemo {

    public static void main(String[] args) {
        Map<String, Customer> map = new HashMap<>();
        var c1 = new Customer("A", "A@gmail.com");
        var c2 = new Customer("B", "B@gmail.com");
        var c3 = new Customer("C", "C@gmail.com");
        var c4 = new Customer("D", "D@gmail.com");

        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);
        map.put(c3.getEmail(), c3);
        map.put(c4.getEmail(), c4);

        Customer a = map.get("A@gmail.com");
        System.out.println(a);
        System.out.println(map);

        boolean exists = map.containsKey("C@gmail.com");
        System.out.println(exists);

        for (var arg : map.keySet()) {
            System.out.println(arg);
        }
        for (var object : map.entrySet()) {
            System.out.println(object);
        }

    }
}
