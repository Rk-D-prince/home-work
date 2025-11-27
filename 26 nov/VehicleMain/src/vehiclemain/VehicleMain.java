/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiclemain;

/**
 *
 * @author RAJA KANNAN
 */

class Vehicle {
    String type;
    int speed;
    
    Vehicle(String type, int speed){
        this.type = type;
        this.speed = speed;
    }
    
    void showinfo(){
        System.out.println("Type :" + type + ", Speed:" + speed);
    }
}

class Car extends Vehicle{
    Car(String type, int speed){
        super(type, speed);
    }
}

class Bike extends Vehicle{
    Bike(String type, int speed){
        super(type, speed);
    }
} 

public class VehicleMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Car c = new Car("Sedan", 120); 
          c.showinfo(); 
          Bike b = new Bike("Scooter", 60); 
          b.showinfo();
    }
    
}
