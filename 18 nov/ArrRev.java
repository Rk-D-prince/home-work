class ArrRev{
	public static void main(String[] args){
		int arr[] = {2,3,5,7,56};
		
		ArrRev a = new ArrRev();
		int start = 0;
		int end = arr.length-1;
		
		a.reverse(arr, start, end);
		for(int i=0; i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
		
	}
	
	void reverse(int arr[], int start, int end){
		if(start<end){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			reverse(arr, start+1, end-1);
		}
	}
}