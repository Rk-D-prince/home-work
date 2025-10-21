import java.util.Scanner;

class Alphabet{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		char word = sc.next().charAt(0);
		
		if(Character.isLetter(word)){
			System.out.println(word+" is an alphabet");
		}
		else{
			System.out.println(word+" is not an alphabet");
		}
	}
}