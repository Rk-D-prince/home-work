class AddNumbers{
	public static void main(String[] args){
		AddNumbers c = new AddNumbers();
		int res = c.add(10, 15);
		System.out.println(res);
	}
	
	int add(int a,int b){
		int sum = a+b;
		return sum;
	}
}