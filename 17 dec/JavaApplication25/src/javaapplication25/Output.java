/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;
import java.util.*;
/**
 *
 * @author RAJA KANNAN
 */
public class Output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = "HAI SIR HOW CAN I HELP YOU "
                    + "CAN YOU TELL ME ABOUT JAVA "
                +"SURE, JAVA IS AN PROGRAMMING LANGUAGE WHICH IS USED FOR DEVELOP APPLICATIONS WITH PLATFORM INDEPENDENT";
        
        try {
                for(char ch :sentence.toCharArray()){
                    System.out.print(ch);
                    Thread.sleep(300);
            }
                System.out.println("");
           
        } catch (Exception e){
                System.out.println("Sleep Interrupted");
            }
            
    
        }  
}
