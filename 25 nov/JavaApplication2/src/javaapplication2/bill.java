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
public class bill {
    int totalut;
    float perut;
    float tbill;
    bill(int totalut, float perut){
        this.totalut = totalut;
        this.perut = perut;
        tbill = (float)(perut * totalut);   
    }
    
    void calculateBill(){
        System.out.print(tbill);
    }
}
