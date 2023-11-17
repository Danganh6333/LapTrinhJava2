/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class XDate {
    private static SimpleDateFormat dateFormat = new SimpleDateFormat();
    public static Date parse(String text ,String pattern) throws RuntimeException{
        try {
            dateFormat.applyPattern(pattern);
            return dateFormat.parse(text);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static Date parse(String text) throws RuntimeException{
    return  XDate.parse("dd-MM-yyyy");
    }
}
