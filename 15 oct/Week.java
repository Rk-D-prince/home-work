import java.util.Scanner;

class Week
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your week number: 1.mon, 2.tue, 3.wed");
		int num = scan.nextInt();
		
		switch(num)
		{
			case 1:
			System.out.println("Monday");
			break;
			
			case 2:
			System.out.println("Tuesday");
			break;
			
			case 3:
			System.out.println("Wednesday");
			break;
		}
	}
}