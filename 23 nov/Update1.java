import java.util.*;
class Update1{
	public static void main(String[] args){
		int[] arr = {2, 4, 6, 8, 10};
		int index = 3; 
		int val = 99;
		
		Update1 u = new Update1();
		int res[] = u.update(arr, index, val);
		System.out.print(Arrays.toString(res));
		
		
	}
	
	int[] update(int[] arr, int index, int val){
		
		for(int i =0; i<arr.length;i++){
			if(index==i){
				arr[i] = val;
				break;
			}
		}
		return arr;
	}
}