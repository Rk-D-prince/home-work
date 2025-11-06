class fahrenheit{
	public static void main(String[] args){
		fahrenheit f = new fahrenheit();
		System.out.println(f.Convert(13));
	}
	
	float Convert(int c){
		float sum = c * 1.8f + 32;
		return sum;
	}
}