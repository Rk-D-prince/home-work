class PaliLoop{
	public static void main(String[] args){
		int a = 151;
		int temp = a;
		int sum = 0;
		int rem = 0;
		
		while(a>0){
			rem = a%10;
			sum = rem+(sum*10);
			a = a/10;
		}
		if(sum==temp){
			System.out.println("it's a palindrome number");
		}
		else{
			System.out.println("it's not a palindrome number");
		}
	}
}