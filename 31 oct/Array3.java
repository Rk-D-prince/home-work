import java.util.Scanner;
class Array3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length: ");
		int len = sc.nextInt();
		int arr[] = new int[len];
		
		for(int i=0;i<len;i++){
			System.out.println("Enter the value: ");
			arr[i] = sc.nextInt();
		}
		
		for(int i=len-1;i>=0;i--){
			System.out.println(i+" index value of  array is: "+arr[i]);
		}
		
	}
}