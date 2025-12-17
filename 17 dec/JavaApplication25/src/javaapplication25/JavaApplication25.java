/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;

/**
 *
 * @author RAJA KANNAN
 */
public class JavaApplication25 extends Thread {

    @Override
    public void run(){
        String[] names = {"DIWAKAR", "KARTHIK", "RAJESH", "SATHISH", "SURYA"};
        for(int i=0; i<names.length; i++)
        try {
            System.out.println(names[i]);
            Thread.sleep(2000);
        }
        catch (Exception e){
            System.out.println("Sleep interrupted");
        }
    }
    public static void main(String[] args) {
        JavaApplication25 j = new JavaApplication25();
        
        try {
            j.start();
        }
        catch (Exception e) {
            System.out.println("Main interrupted");
        }
    }
    
}
