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

class User{
    String name;
    
    User(String name){
        this.name = name;
    }
    void login(){
    }
}

class Student extends User{
    Student(String name){
        super(name);
    }
    @Override
    void login(){
        System.out.println("Welcome Mr.Goat: "+name); 
    }
}

class Teacher extends User{
    Teacher(String name){
        super(name);
    }
    @Override
    void login(){
     System.out.println("Welcome teacher: "+name); 
    }
}

public class ElearningMain {
    public static void main(String[] args){
        Student s = new Student("Rk");
        s.login();
        
        Teacher t = new Teacher("kumar");
        t.login();
    }
    
}
