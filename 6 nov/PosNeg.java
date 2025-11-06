class PosNeg{
	public static void main(String[] args){
		PosNeg p = new PosNeg();
		int ar[] = {12, 18, -2, -36, 45, -21, 1};
		p.check(ar);
	}
	
	void check(int ar[]){

		for(int i=0;i<ar.length;i++){
			if(0<ar[i]){
				System.out.println("positive number = "+ar[i]);
			}
			else if(ar[i]<0){
				System.out.println("negative number = "+ar[i]);
			}
		}
	}
}