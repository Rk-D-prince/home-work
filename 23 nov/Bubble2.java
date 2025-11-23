import java.util.*;

class Bubble2{
	public static void main(String[] args){
		int[] arr = {5, 1, 4, 2, 8};
		Bubble2 b = new Bubble2();
		int[] res = b.sort(arr);
		System.out.print(Arrays.toString(res));
		
	}
	
	int[] sort(int[] arr){
	for(int i=0; i<arr.length; i++){
		for(int j=0; j<arr.length-1-i; j++){
			if(arr[j] < arr[j+1]){
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}
	return arr;
	}
}