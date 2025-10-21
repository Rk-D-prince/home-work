import java.util.Scanner;

class RailwayClass{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a class number: (1.General,2.Sleeper,3.AC 3-Tier,4.AC 2-Tier,5.First Class)");
		int num = sc.nextInt();
		
		switch(num){
			case 1:
				System.out.println("General Class price-200");
				break;
			case 2:
				System.out.println("Sleeper Class price-300");
				break;
			case 3:
				System.out.println("AC 3-Tier Class price-400");
				break;
			case 4:
				System.out.println("AC 2-Tier Class price-500");
				break;
			case 5:
				System.out.println("First Class price-600");
				break;
		}
	}
}