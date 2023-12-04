/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7;

/**
 *
 * @author Admin
 */
public class XPoly {
    @Deprecated
    public static boolean isCardNumber(String number){
        int i = Integer.parseInt(number);
        int tong = 0;
        while (i>0) {            
            int a = i % 100;
            tong +=a;
            i = i/10;
        }
        return tong % 2 ==0;
    }
}
