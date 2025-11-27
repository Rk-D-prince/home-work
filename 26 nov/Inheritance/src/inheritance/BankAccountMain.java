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

class BankAccount{
    String AcNo;
    int balance;
    double ans;
    
    BankAccount(String AcNo, int balance){
        this.AcNo = AcNo;
        this.balance = balance;
    
    }
    void calculateInterest(){
        
    }
}

class SavingsAccount extends BankAccount{
    SavingsAccount(String AcNo, int balance){
        super(AcNo, balance);
    }
    
     void calculateInterest(){
        double ans = balance * 0.04;
        System.out.println("Savings Interest: "+ans);    
    }
}

class CurrentAccount extends BankAccount{
    CurrentAccount(String AcNo, int balance){
        super(AcNo, balance);
    }
    void calculateInterest(){
        double ans = balance * 0.01;
        System.out.println("Current Interest: "+ans);    
    }
    
}
public class BankAccountMain {
    
    public static void main(String[] args){
        SavingsAccount sa = new SavingsAccount("A100", 10000);
        sa.calculateInterest();
            
        CurrentAccount ca = new CurrentAccount("C200", 15000);
        ca.calculateInterest();
    }
}
