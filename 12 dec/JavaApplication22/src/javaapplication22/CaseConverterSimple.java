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
public class CaseConverterSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

   
        System.out.println("Enter the input:");
        String Word = sc.nextLine();
        System.out.println("Press 1 for Uppercase");
        System.out.println("Press 2 for Lower Case");
        int choice = sc.nextInt(); 
        String result = "";
        switch (choice) {
            case 1:
                result = Word.toUpperCase();
                System.out.println(result);
                break;
            case 2:
                result = Word.toLowerCase();
                System.out.println(result);
                break;
        }
        
}
}
