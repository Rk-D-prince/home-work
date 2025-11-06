class IsEven{
	public static void main(String[] args){
		IsEven s = new IsEven();
		boolean res = s.Even(8);
		System.out.println(res);
		
	}
	
	boolean Even(int a){
		if(a%2==0){
			return true;
		}
		else{
			return false;
		}
	}
}