/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Admin
 */
public class MapDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<String, Student> map = new HashMap<>();
        Student sv1 = new Student();
        sv1.name = "Tuấn";
        sv1.major = "CNTT";
        sv1.marks = 7.0;
        map.put(sv1.name, sv1);
        Student sv2 = new Student();
        sv2.name = "Nam";
        sv2.major = "Marketing";
        sv2.marks = 9.0;
        map.put(sv2.name, sv2);
        Student sv3 = new Student();
        sv3.name = "Huy";
        sv3.major = "Logistic";
        sv3.marks = 6.0;
        map.put(sv3.name, sv3);
        Set<String> keys = map.keySet();
        for (String name : keys) {
            Student sv = map.get(name);
            System.out.println(">Họ và tên: " + sv.name);
            System.out.println(">Học lực: " + sv.getGrade());
        }
    }

}
