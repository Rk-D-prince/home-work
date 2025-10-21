import java.util.Scanner;

class Vowel{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		char word = sc.next().charAt(0);
		
		switch(word){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("Vowel");
				break;
			default:
				System.out.println("Consonant");
		}
	}
}