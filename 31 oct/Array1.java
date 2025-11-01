import java.util.Scanner;

class Array1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array length: ");
		int len = sc.nextInt();
		int arr[] = new int[len];
		
		for(int i=0;i<len;i++){
			System.out.println("Enter num: ");
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<len;i++){
			System.out.println(i+" index value of array is: "+arr[i]);
		}
	}
}