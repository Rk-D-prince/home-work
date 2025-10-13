class Palindrome
{	
	
	public static void main(String[] args)
		{
		int a = 121;
		int b = a;
		
		int c = a%10;
		int d = a/10;
		int e = d%10;
		int f = d/10;
		
		int g = (f*100)+(e*10)+(c);
		boolean h = (g==b);
		System.out.println(h);
		}
}