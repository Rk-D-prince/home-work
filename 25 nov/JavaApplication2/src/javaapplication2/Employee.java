/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author RAJA KANNAN
 */
public class Employee {
    String Name;
    int Salary;
    int NetSalary;
    int tax;
    
    Employee(String Name, int Salary){
        this.Name = Name;
        this.Salary = Salary;
        tax = Salary * 10/100;
        NetSalary = Salary - tax;
    }
    
    void showNetSalary(){
        System.out.println("Name :"+Name);
        System.out.println("Gross Salary: Rs."+Salary);
        System.out.println("Tax: Rs."+tax);
        System.out.println("Net Salary: Rs."+NetSalary);
    }
}
