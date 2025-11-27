/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author RAJA KANNAN
 * 
 * 
 */

class Animal{
    void makeSound(){
        System.out.println("Animal make sound");
        }
}

class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal{
    @Override
    void makeSound(){
       System.out.println("Cat Meows");
    }
}
public class Inheritance{
    public static void main(String[] args) {
        // TODO code application logic here
         
        Dog d = new Dog(); 
        d.makeSound(); 
        Cat c = new Cat(); 
        c.makeSound();
    }
    
}
