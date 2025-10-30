import java.util.Scanner;
class Prime
{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number above 1");
	int num = sc.nextInt();
	boolean isprime = true;
	
	if(num <=1){
		isprime = false;
	}
	else if(num%2==0){
		isprime = false;
	}
	else{
	for(int i=3;i<num;i+=2){
		if(num%i==0){
			isprime = false;
		}
		else{
			isprime;
			break;
		}
	}
	}
	
	if(isprime){
		System.out.println("prime number");
	}
	else{
		System.out.println("not a prime number");
	}
		
	}	
}