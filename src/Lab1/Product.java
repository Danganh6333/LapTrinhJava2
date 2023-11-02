package Lab1;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class Product implements DAO{

    public Product() {
    }

    public Product(String name, double price) {
    }

    private String name;
    private double price;

    public double getImportTax() {
        return price * 10 / 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 6; i++) {
            
            System.out.println("Product : " + i);
            Product product = new Product();

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
        }

    }

    @Override
    public void insert() {
        System.out.println("Them moi thanh cong !"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update() {
        System.out.println("Cap nhat thanh cong !"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete() {
        System.out.println("Xoa thanh cong !"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void select() {
        System.out.println("Chon lua thanh cong !");; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
