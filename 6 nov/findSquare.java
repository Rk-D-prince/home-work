class findSquare{
	public static void main(String[] args){
		findSquare s = new findSquare();
		int res = s.Square(10);
		System.out.println(res);
	} 
	
	int Square(int a){
		int sum = a*a;
		return sum;
	}
}