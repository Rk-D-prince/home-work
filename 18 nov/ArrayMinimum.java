class ArrayMinimum{
	public static void main(String[] args){
		int arr[] = {2,4,3,1,5};
		ArrayMinimum ar = new ArrayMinimum();
		int i = 1;
		int min = arr[0];
		System.out.print(ar.minimum(arr, i, min));
		
	}
	
	int minimum(int arr[], int i, int min){
		if(i<arr.length){
			if(min>arr[i]){
				min = arr[i];
			}
			return minimum(arr, i+1, min);
		}
		return min;
	}
}