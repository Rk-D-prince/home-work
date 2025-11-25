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
public class Fahrenheit {
    int C;
    float F;
    
    Fahrenheit(int C){
        this.C = C;
        this.F = (float)(C*1.8)+32;
    }
    
    void print(){
        System.out.print("Calculated Fahrenheit is "+ F);
    }
    
}
