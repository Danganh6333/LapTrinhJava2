/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8;

/**
 *
 * @author Admin
 */
public class ProductManager {

    public static void main(String[] args) {
        Product p1 = new Product("iPhone9", 1000.0);
        Product p2 = new Product("Samsung Start", 3000.0);
        
        ProductDAO dao = new ProductDAO();
        dao.add(p1);
        dao.add(p2);
        try {
//            dao.store("prod.dat");
              dao.load("prod.dat");
              Product p = dao.find("Samsung Start");
              System.out.println("Name :" + p.getName());
              System.out.println("Price :" + p.getPrice());
        } catch (Exception e) {
        }
  
    }


}
