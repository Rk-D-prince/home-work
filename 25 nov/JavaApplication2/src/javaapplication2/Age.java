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
public class Age {
    int age;
    int year;
    
    Age(int year){
        this.year = year;
        age = 2025 - year;
    }
    
    void showAge(){
        System.out.print("your age in 2025 is "+age);
    }
    
    
}
