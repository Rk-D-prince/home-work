import java.util.*;

class insert1{
	public static void main(String[] args){
		int[] arr = {10, 20, 30, 40, 50};
		int element = 99;
		int pos = 3;
		
		insert1 in = new insert1();
		
		int res[] = in.insertion(arr, pos, element);
		System.out.print(Arrays.toString(res));
		
		
	}
		
		int[] insertion(int[] arr, int pos, int element){
			
			int brr[] = new int[arr.length+1];
			
			for(int i=0; i<pos-1; i++){
				brr[i] = arr[i];
			}
			brr[pos-1] = element;
			
			for(int i=pos; i<brr.length; i++){
				brr[i] = arr[i-1];
			}
			return brr;
	}
}