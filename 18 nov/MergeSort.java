import java.util.*;

class MergeSort{
	public static void main(String[] args){
		MergeSort ms = new MergeSort();
		int ar[] = {1,8,3,6,5};
		int res[] = new int[ar.length];
		res = ms.divide(ar);
		
		for(int i=0; i<ar.length;i++){
			System.out.print(res[i]+" ");
		}
		
	}
	
	public int[] divide(int ar[]){
		if(ar.length==1){
			return ar;
		}
		
		int mid = ar.length/2;
		int left[] = divide(Arrays.copyOfRange(ar,0,mid));
		int right[] = divide(Arrays.copyOfRange(ar, mid, ar.length));
		
		return conquer(left, right);
	}
	
	public int[] conquer(int left[], int right[]){
		int i = 0, j = 0, k = 0;
		int newArray[] = new int[left.length + right.length];
		
		while(i<left.length && j<right.length){
			if(left[i]<right[j]){
				newArray[k] = left[i];
				i++;
				k++;
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