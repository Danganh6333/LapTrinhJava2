/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assigment;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class EmployeeService {
    ArrayList<Employee> list;
    
    public EmployeeService(){
        this.list = new ArrayList<>();
    }
    public void Nhap(Employee n){
        this.list.add(n);
    }
    public void Xoa(int ViTri){
        this.list.remove(ViTri);
    }
    public void Sua(int ViTri,Employee n){
        this.list.set(ViTri,n);
    }
    public Employee Tim(String Id){
        for (Employee employee : list) {
            if(String.valueOf(employee.getMaNV()).equals(Id)){
              return employee;
            }
        }
        return null;
    }
    public ArrayList<Employee> LayDanhSach(){
        return list;
    }
    public void DatDanhSach(ArrayList<Employee> l){
        this.list = l ;
    }
}
