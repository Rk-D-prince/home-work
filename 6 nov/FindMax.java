class FindMax{
	public static void main(String[] args){
		FindMax f = new FindMax();
		int res = f.Max(8, 6);
		System.out.println(res);
	}
	
	int Max(int a, int b){
		int max = 0;
		if(a<b){
			max = b;
		}
		else if(a>b){
			max = a;
		}
		return max;
	}
}