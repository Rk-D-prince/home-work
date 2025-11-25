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
public class BMI {
    float weight;
    float height;
    float ans;
    BMI(float weight, float height){
        this.weight = weight;
        this.height = height;
        this.ans = ans;
        ans = weight/(height*height);
    }
    
    void printBMI(){
    System.out.print("BMI: "+ans);
    }
}
