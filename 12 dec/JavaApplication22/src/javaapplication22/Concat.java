/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;
import java.util.*;
/**
 *
 * @author RAJA KANNAN
 */


public class Concat{
    public String Concat1(String name1, String name2){
    StringBuilder sb = new StringBuilder();
    sb.append(name1).append(" ").append(name2);
    return sb.toString();
 
}
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the FirstName: ");
        String name1 = sc.nextLine();
        System.out.println("Enter the SecondName: ");
        String name2 = sc.nextLine();
        
        Concat c = new Concat();
        String fullname = c.Concat1(name1, name2);
        System.out.println("Fullname: "+fullname );
    }   
}