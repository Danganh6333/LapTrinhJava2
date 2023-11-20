package Buoi7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Input a: ");
            int a = s.nextInt();
            System.out.println("Input b: ");
            int b = s.nextInt();
            int result = a / b;
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Can't be divided by 0");
        } catch (InputMismatchException e) {
            System.out.println("Variable that are not numbers are cancel");
        } finally {
            System.out.println("Yeah sure");
            s.close();
        }

    }
}
