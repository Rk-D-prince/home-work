class SecondMax{
	public static void main(String[] args){
		int arr[] = {28,16,7,15,23,2};
		int max=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		int secmax = 0;
		for(int i=0;i<arr.length;i++){
			if((arr[i]<max)&&(arr[i]>secmax)){
				secmax = arr[i];
			}
		}
		System.out.print(secmax);
	}
}