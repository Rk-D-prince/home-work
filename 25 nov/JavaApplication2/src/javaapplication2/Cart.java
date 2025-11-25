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
public class Cart{
    int p1;
    int p2;
    int p3;
    int tprice;
    
    Cart(int p1, int p2, int p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        tprice = p1 + p2 + p3;
    }
    
    void showTotal(){
        System.out.print("Total Cart Value : Rs."+tprice);
    }
    
}
