/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author RAJA KANNAN
 */

class Booking{
    String name;
    String Sno;
    
    Booking(String name, String Sno){
        this.name = name;
        this.Sno = Sno;
    }
    void printDetails(){
    
    }
}

class FlightBooking extends Booking{
    FlightBooking(String name, String Sno){
        super(name, Sno);
    }
    void printDetails(){
        System.out.println("Flight: "+name+" - "+Sno);
    }
}

class TrainBooking extends Booking{
    TrainBooking(String name, String Sno){
        super(name, Sno);
    }
    void printDetails(){
        System.out.println("Express: "+name+" - "+Sno);
    }
}
public class TravelBookingMain {
    public static void main(String[] args){
        FlightBooking f = new FlightBooking("Indigo", "6E123");
        f.printDetails();
        
        TrainBooking t = new TrainBooking("Express", "12675");
        t.printDetails();
    }
}
