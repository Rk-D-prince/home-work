class ArmRec{
	public static void main(String[] args){
		int num = 153;
		ArmRec ar = new ArmRec();
		int a = ar.armstrong(num, 0);
		if(num==a){
			System.out.print("This is a Armstrong number");
		}
		else{
			System.out.print("This is not a Armstrong number");
		}
		
	}
	
	
	int rem = 0;
	int armstrong(int num, int sum){
		if(num==0){
			return sum;
		}
		rem = num%10;
		sum += (rem*rem*rem);         /*rem +(sum*10)*/
		return armstrong(num/10, sum);
	}
}