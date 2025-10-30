import java.util.Scanner;

class Bill
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the electricity unit: ");
		int unit = sc.nextInt();
		int bill;
		
		if(unit <= 100){
			bill = unit * 5;
			System.out.println(" Electricity Bill: Rs."+bill);
		}
		else if(unit > 100 && unit <= 200){
			bill = unit * 7;
			System.out.println(" Electricity Bill: Rs."+bill);
		}
		else if(unit > 200){
			bill = unit * 10;
			System.out.println(" Electricity Bill: Rs."+bill);
		}
	}
}