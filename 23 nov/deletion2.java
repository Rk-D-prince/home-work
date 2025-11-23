import java.util.*;

class deletion2{
	public static void main(String[] args){
		int[] arr = {7, 14, 21, 28, 35};
		int val = 21;
		deletion2 d = new deletion2();
		int res[] = d.delete(arr, val);
		System.out.print(Arrays.toString(res));
			
	}
	
	int[] delete(int[] arr, int val){
		
		int brr[] = new int[arr.length-1];
		
		int index = -1;
		for(int i=0;i<arr.length;i++){
			if(arr[i] == val){
				index = i;
				break;
			}
		}
		
		for(int i=0, j=0; i<arr.length; i++){
			if(i==index){
				continue;
			}
			brr[j] = arr[i];
			j++;
		}
		return brr;
		
		
	}
}