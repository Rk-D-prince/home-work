/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

/**
 *
 * @author RAJA KANNAN
 */
public class Student {
    static String Sclname = "Magizhchi School";
    String Name;
    
     Student(String Name) {
        this.Name = Name;
    }
    
    public void tracker(){
        
        System.out.println("Student name: "+Name);
        System.out.println("School name: "+Sclname);
    }
    
    public static void changeSclName(String sname){
        Sclname = sname;
    }
    
    public static void main(String[] args) {
        Student s1 = new Student("rk");
        Student s2 = new Student("ak");
        Student s3 = new Student("ezhil");
    
        s1.tracker();
        s2.tracker();
        s3.tracker();
        
        Student.changeSclName("VIT");
        
        s1.tracker();
        s2.tracker();
        s3.tracker();
        
        
    }
}
