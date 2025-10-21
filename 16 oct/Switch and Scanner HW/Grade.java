import java.util.Scanner;

class Grade{
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the Grade: (A,B,C,D,F)");
		char Grade = sc.next().toUpperCase().charAt(0);
		
		switch(Grade){
			case 'A':
				System.out.println("Great");
				break;
			case 'B':
				System.out.println("Good");
				break;
			case 'C':
				System.out.println("Not Bad");
				break;
			case 'D':
				System.out.println("Just Pass");
				break;
			case 'F':
				System.out.println("Fail");
				break;
		}
	}
}