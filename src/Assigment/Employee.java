package Assigment;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class Employee implements Serializable{
    public int maNV;
    public String hoTenNV;
    public int tuoiNV;
    public String emailNV;
    public double luongNV;

    public Employee() {
    }
    
    public Employee(int maNV, String hoTenNV, int tuoiNV, String emailNV, double luongNV) {
        this.maNV = maNV;
        this.hoTenNV = hoTenNV;
        this.tuoiNV = tuoiNV;
        this.emailNV = emailNV;
        this.luongNV = luongNV;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getHoTenNV() {
        return hoTenNV;
    }

    public void setHoTenNV(String hoTenNV) {
        this.hoTenNV = hoTenNV;
    }

    public int getTuoiNV() {
        return tuoiNV;
    }

    public void setTuoiNV(int tuoiNV) {
        this.tuoiNV = tuoiNV;
    }

    public String getEmailNV() {
        return emailNV;
    }

    public void setEmailNV(String emailNV) {
        this.emailNV = emailNV;
    }

    public double getLuongNV() {
        return luongNV;
    }

    public void setLuongNV(double luongNV) {
        this.luongNV = luongNV;
    }

    @Override
    public String toString() {
        return "Employee{" + "maNV=" + maNV + ", hoTenNV=" + hoTenNV + ", tuoiNV=" + tuoiNV + ", emailNV=" + emailNV + ", luongNV=" + luongNV + '}';
    }
    
    
}
