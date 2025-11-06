class SimpleInterest{
	public static void main(String[] args){
		SimpleInterest s = new SimpleInterest();
		float res = s.Calculate(10, 5, 2);
		System.out.println(res);
	}
	
	float Calculate(int p, int r, int t){
		float years = t/365.0f;
		float sum = (p*r*years)/100.0f;
		return sum;
	}
}