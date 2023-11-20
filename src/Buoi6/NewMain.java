package Buoi6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Admin
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Student> arrayList = new ArrayList<Student>();
        arrayList.add(new Student("A", 14, 8));
        arrayList.add(new Student("B", 12, 5));
        arrayList.add(new Student("F", 11, 7));
        arrayList.add(new Student("D", 15, 3));
        arrayList.add(new Student("E", 17, 10));
        System.out.println(arrayList);

        //Sắp xếp theo tên        
        Collections.sort(arrayList,
                (o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println(arrayList);
        //Sắp xếp theo tuổi
        Collections.sort(arrayList,
                (o1, o2) -> o1.getAge() - (o2.getAge()));
        System.out.println(arrayList);

    }

}
