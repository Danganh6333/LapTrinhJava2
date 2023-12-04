/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class MainStudents {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Tuấn", 5, "CNTT"));
        list.add(new Student("Cường", 7.5, "TKTW"));
        list.add(new Student("Hạnh", 8.5, "CNTT"));
        XFile.writeObject("D:/MOB1023/JavaApplication18/student.dat", list);
        List<Student> list2 = (List<Student>)XFile.readObject("D:/MOB1023/JavaApplication18/student.dat");
        for (Student student : list) {
            System.out.println(">Họ và tên: "+student.name);
        }
    }
}
