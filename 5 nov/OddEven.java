class OddEven{
	public static void main(String[] args){
		int[] arr = {28,16,7,15,23,2};
		int evencount = 0;
		int oddcount = 0;
		int evensum = 0;
		int oddsum = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				evencount+=1;
				evensum+=arr[i];
			}
			else{
				oddcount+=1;
				oddsum+=arr[i];
			}
		}
		System.out.println(oddcount);
		System.out.println(evencount);
		System.out.println(oddsum);
		System.out.println(evensum);
	}
}