import java.util.*;

class Search{
	public static void main(String[] args){
		int[] arr = {11, 22, 33, 44, 55};
		int old_val = 33;
		int new_val = 333;
		
		Search s = new Search();
		int res[] = s.update(arr, old_val, new_val);
		System.out.print(Arrays.toString(res));
		
	}
	
	int[] update(int[] arr, int old_val, int new_val){
		int index = -1;
		for(int i=0; i<arr.length; i++){
			if(arr[i] == old_val){
				index = i;
			}
		}
		arr[index] = new_val;
		return arr; 
	}
}