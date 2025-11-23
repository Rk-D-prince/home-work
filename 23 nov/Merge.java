import java.util.*;

class Merge{
	public static void main(String[] args){
		int[] arr = {38, 27, 43, 3, 9, 82, 10};
		Merge m = new Merge();
		int res[] = m.divide(arr);
		System.out.print(Arrays.toString(res));
		
			
	}
	
	int[] divide(int[] arr){
		if(arr.length==1){
			return arr;
		}
		int mid = arr.length/2;
		
		int[] left = divide(Arrays.copyOfRange(arr, 0, mid));
		int[] right = divide(Arrays.copyOfRange(arr, mid, arr.length));
		
		return conquer(left, right);
	}
	
	int[] conquer(int[] left, int right[]){
		int i = 0, j = 0, k = 0;
		int newArray[] = new int[left.length + right.length];
		
		while(i<left.length && j<right.length){
			if(left[i]<right[j]){
				newArray[k] = left[i];
				k++;
				i++;
			}
			else{
				newArray[k] = right[j];
				k++;
				j++;
			}
			
		}
		while(i<left.length){
			newArray[k] = left[i];
			k++;
			i++;
		}
		
		while(j<right.length){
			newArray[k] = right[j];
			k++;
			j++;
		}
		
		return newArray;
	}
}