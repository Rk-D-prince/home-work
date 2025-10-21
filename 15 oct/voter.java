import java.util.Scanner;

class voter
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int age = scan.nextInt();
		
		if (age >= 18)
		{
			System.out.println("you are eligible");
		}
		else if(age < 18)
		{
			System.out.println("you are not eligible");
		}
	}
}