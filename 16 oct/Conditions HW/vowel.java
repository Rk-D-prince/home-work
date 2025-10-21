import java.util.Scanner;

class vowel{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		char word = sc.next().charAt(0);
		
		if(word=='a'||word=='e'||word=='i'||word=='o'||word=='u'){
			System.out.println(word+" is a vowels");
		}	
	    else{
			System.out.println(word+" is a consonant");
		}
	}
}