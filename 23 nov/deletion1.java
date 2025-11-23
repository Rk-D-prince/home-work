import java.util.*;

class deletion1{
	public static void main(String[] args){
		deletion1 d = new deletion1();
		int[] arr = {1, 2, 3, 4, 5};
		int pos = 3;
		int[] res = d.delete(arr, pos);
		System.out.print(Arrays.toString(res));
	}
	
int[] delete(int[] arr, int pos){
	int brr[] = new int[arr.length-1];
	for(int i=0; i<pos-1;i++){
		brr[i] = arr[i];
	}
	
	for(int i=pos-1; i<brr.length;i++){
		brr[i] = arr[i+1];
	}
	return brr;
		
}
}