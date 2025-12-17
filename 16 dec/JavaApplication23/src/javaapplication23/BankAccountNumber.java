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
public class BankAccountNumber {
    final int accNo;
    String name;
    BankAccountNumber(int accNo, String name){
        this.accNo = accNo;
        this.name = name;
    }
    void display(){
        System.out.println("Account number: "+ accNo);
    }
    
    public static void main(String[] args) {
        BankAccountNumber b = new BankAccountNumber(23462,"rk");
        BankAccountNumber b1 = new BankAccountNumber(22462, "gm");
        
        b.accNo = 2345; 
        b.display();
        b1.display();
        
//        BankAccountNumber b1 = new BankAccountNumber(22462);
//        b1.display();
    }
}
