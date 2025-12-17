/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication24;
import java.io.*;
/**
 *
 * @author RAJA KANNAN
 */
public class FinallyBlock {
    
    
    public static void main(String[] args) {
        FileReader reader;
        
        try{
            reader = new FileReader("requirements.txt");
            System.out.println("File opened successfully.");
        }
        catch (FileNotFoundException f){
            System.out.println("File does not exist");
        }
        finally {
            System.out.println("Closing resources\"");
        }
        
    }
    
}
