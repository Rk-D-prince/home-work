class ArmLoop{
	public static void main(String[] args){
		int a = 153;
		int temp = a;
		int sum = 0;
		int rem = 0;
		
		while(a>0){
			rem = a%10;
			sum = sum+(rem*rem*rem);
			a = a/10;
		}
		if(sum==temp){
			System.out.println("it's a armstrong number");
		}
		else{
			System.out.println("it's not a armstrong number");
		}
	}
}