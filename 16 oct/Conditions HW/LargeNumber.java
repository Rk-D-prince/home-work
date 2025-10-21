import java.util.Scanner;

class LargeNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		
		if(a>b){
			System.out.println(a+" is a largest number");
		}
		else if(a<b){
			System.out.println(b+" is a largest number");
		}
	}
}