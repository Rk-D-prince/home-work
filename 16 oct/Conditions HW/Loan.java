import java.util.Scanner;

class Loan{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.nextLine();
		System.out.println("Enter age");
		int age = sc.nextInt();
		System.out.println("Enter salary");
		int salary = sc.nextInt();
		
		if(age>21 && salary>=25000){
			System.out.println(name+" is eligible for loan");
		}
		else{
			System.out.println(name+" is not eligible for loan");
		}
	}
}