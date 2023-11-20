package Buoi5;

/**
 *
 * @author Admin
 */
public class Student {
    private String Name;
    private double Grade;

    public Student(String Name, double Grade) {
        this.Name = Name;
        this.Grade = Grade;
    }

    public Student() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getGrade() {
        return Grade;
    }

    public void setGrade(double Grade) {
        this.Grade = Grade;
    }
}
