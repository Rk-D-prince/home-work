import java.util.Scanner;

class Grade{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mark");
		int mark = sc.nextInt();
		
		if(mark>90){
			System.out.println("A grade");
		}
		else if(mark>70 && mark<90){
			System.out.println("B grade");
		}
		else if(mark>50 && mark<70){
			System.out.println("C grade");
		}
		else if(mark>25 && mark<50){
			System.out.println("D grade");
		}
		else if(mark<25){
			System.out.println("Fail");
		}
	} 
}