class ArrayMaximum{
	public static void main(String[] args){
		int arr[] = {30,6,4,22,3};
		int i = 0;
		
		ArrayMaximum ar = new ArrayMaximum();
		System.out.print(ar.maximum(arr, i));
		
	}
	int max = 0;
	int maximum(int arr[], int i){
		if(i<arr.length){
			if(arr[i]>max){
				max = arr[i];
			}
			maximum(arr, i+1);
		}
		return max;
	}
}