/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication24;
import java.util.*;
/**
 *
 * @author RAJA KANNAN
 */
public class InvalidAgeException1 {
    
    public static void check(int age) throws Exception{
        if(age>=18)
            System.out.println("You're applicable.");
        else{
            throw new Exception("you're not eligible");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        
        try{
            check(age);
        }
        catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }
       
    }
}


//package JavaApplication24;
//
//import java.util.*;
//
//// 1. Custom exception
//class InvalidAgeException extends Exception {
//    public InvalidAgeException(String message) {
//        super(message);
//    }
//}
//
//public class InvalidAgeException1 {
//
//    // 2. Method that can throw the custom exception
//    public static void check(int age) throws InvalidAgeException {
//        if (age < 18) {
//            throw new InvalidAgeException("Age must be 18 or above.");
//        } else {
//            System.out.println("Access granted. Age is valid.");
//        }
//    }
//
//    // 3. main: read age and handle exception
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter age: ");
//        int age = sc.nextInt();
//
//        try {
//            check(age);          // may throw InvalidAgeException
//        } catch (InvalidAgeException e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//
//        sc.close();
//    }
//}
