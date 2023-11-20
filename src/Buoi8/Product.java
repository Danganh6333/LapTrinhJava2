/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi8;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class Product implements Serializable{
    public String name;
    public double price;
    public int quantity;

    public Product() {
    }
    
    
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + ", quantity=" + quantity + '}';
    }
    
    
}
