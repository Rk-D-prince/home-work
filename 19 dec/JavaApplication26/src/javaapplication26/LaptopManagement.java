/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;
import java.util.*;
/**
 *
 * @author RAJA KANNAN
 */
public class LaptopManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Acer> LaptopList = new ArrayList<>();
        
        
        while(true){
            System.out.println("Enter 1 for entry || 2 for search: ");
            int input = sc.nextInt();
            sc.nextLine();
            
            if(input==1){
                System.out.println("Enter the model of laptop: ");
                String model = sc.nextLine();
                
                System.out.println("Color of the laptop: ");
                String colour = sc.nextLine();
                
                System.out.println("Is it rgb keyboard (True/ false): ");
                boolean rgb = sc.nextBoolean();
                sc.nextLine();
                
                System.out.println("Enter the processor: ");
                String processor = sc.nextLine();
                //sc.nextLine();
                
                System.out.println("Enter the price: ");
                int price = sc.nextInt();
                sc.nextLine();
                
                LaptopList.add(new Acer(model, colour, rgb, processor, price));
            
            }
            else if(input==2){
                System.out.println("Enter the model of laptop: ");
                String LapModel = sc.nextLine();
                
                for(Acer lap: LaptopList){
                    if(lap.model.equals(LapModel)){
                        lap.display();
                        break;
                    }
                }
            }
        }
        
    
    
    }
}
