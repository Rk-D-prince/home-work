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
public class FileNotFoundException1 {
    
    public static void main(String[] args) {
        FileReader reader = null;
        try{
           reader = new FileReader("requirements.txt");
        }
        catch (FileNotFoundException e){
            System.out.println("Error: test.txt file not found.");
        }
    }
}
