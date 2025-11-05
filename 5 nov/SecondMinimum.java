class SecondMinimum{
	public static void main(String[] args){
		int[] arr = {28,16,7,15,23,2};
		int min = arr[0];
		for(int i=1; i<arr.length;i++){
			if(arr[i]<min){
				min = arr[i];
			}
		}
		int secmin = arr[0];
		for(int i=1;i<arr.length;i++){
			if((arr[i]>min)&&(arr[i]<secmin)){
				secmin=arr[i];
			}
		}
		System.out.println(secmin);
	}
}