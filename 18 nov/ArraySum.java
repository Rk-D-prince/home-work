class ArraySum{
	public static void main(String[] args){
		int arr[] = {1,4,5,6,22,12};
		ArraySum ar = new ArraySum();
		int i = 0;
		System.out.print(ar.sum(arr, i));
		
	}
	
	int res = 0;
	int sum(int arr[], int i){
		if(i<arr.length){
			res += arr[i];
			sum(arr,i+1);
		}
		return res;
	}
	
}