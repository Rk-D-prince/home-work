/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RAJA KANNAN
 */
import java.io.*;
public class CheckedvsUnchecked {
    static void checkedMethod() throws IOException {
        throw new IOException("This is a checked exception");
    }
    
    static void uncheckedMethod() {
        String s = null;
        s.length();  // causes NullPointerException
    }
    
    public static void main(String[] args) {
        try {
            // call either method to see behavior
            checkedMethod();      // comment/uncomment to test
            //uncheckedMethod();    // comment/uncomment to test
        } 
        catch (IOException e) {   // checked
            System.out.println("Caught checked exception: " + e.getMessage());
        } 
        catch (NullPointerException e) {  // unchecked
            System.out.println("Caught unchecked exception: " + e.getMessage());
        }
    }
    
}


