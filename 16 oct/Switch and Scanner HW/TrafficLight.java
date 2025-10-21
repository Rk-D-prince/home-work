import java.util.Scanner;

class TrafficLight{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Colour: (Red,Yellow,Green)");
		String colour = sc.nextLine();
		
		switch(colour){
			case "Red":
				System.out.println("Stop");
				break;
			case "Yellow":
				System.out.println("prepare to stop");
				break;
			case "Green":
				System.out.println("Go");
		}
	}
}