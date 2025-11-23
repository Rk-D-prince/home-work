import java.util.*;

class insert2{
	public static void main(String[] args){
		insert2 in = new insert2();
		int[] arr = {5, 10, 15, 20};
		int element = 25;
		int res[] = in.insert(arr, element);
		System.out.print(Arrays.toString(res));
		
	}
	
	int[] insert(int[] arr, int element){
		int brr[] = new int[arr.length+1];
		
		for(int i=0; i<brr.length-1; i++){
			brr[i] = arr[i];
		}
		brr[brr.length-1] = element;
		return brr;
	}
}