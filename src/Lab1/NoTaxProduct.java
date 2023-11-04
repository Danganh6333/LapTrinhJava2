/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NoTaxProduct extends Product{
    @Override
    public double getImportTax() {
        return 0;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 4; i++) {
         
            System.out.println("Product : " + i);
            Product product;

            if(i==1){
                product = new NoTaxProduct();
            }else{
                product = new Product();
            }
            System.out.print("THE NAME OF THE PRODUCT :");
            String sTen = scanner.nextLine();
            product.setName(sTen);
            
            System.out.print("THE PRICE OF THE PRODUCT :");
            double dGia = scanner.nextDouble();
            product.setPrice(dGia);
            scanner.nextLine();

            System.out.println("The Name Of The Product : " + product.getName());
            System.out.println("The Price Of The Product : " + product.getPrice());
            System.out.println("The Import Tax Of The Product :" + product.getImportTax());
            
            product.insert();
            product.update();
            product.select();
            product.delete();
        }
        System.out.println("Them thanh cong");
    }
}
