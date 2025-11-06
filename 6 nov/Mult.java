class Mult{
	public static void main(String[] args){
		Mult m = new Mult();
		m.table(16);
		
	}
	
	void table(int a){
		for(int i=1; i<=a; i++){
			for(int j=1;j<=10;j++){
				int ans = i*j;
				System.out.println(i+"*"+j+"="+ans);
			}
		}
	}
}