/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author RAJA KANNAN
 */

class Employee{
    String name;
    Employee(String name){
        this.name = name;
}
    
    void showRole(){
        System.out.println("Employee role and name");
    }
}

class Manager extends Employee{
    Manager(String name){
        super(name);
    }
    
    void showRole(){
        System.out.println(name+" is a Manager");
    }
}

class Developer extends Employee{
    Developer(String name){
        super(name);
    }
    
    void showRole(){
        System.out.println(name+" is a Developer");
    }
}
    
class EmployeeMain {
     public static void main(String[] args) {
        Manager m = new Manager("Ravi");
        m.showRole();                     

        Developer d = new Developer("Meena");
        d.showRole();                   
    }
}
 
}
    
    
    
    
    

