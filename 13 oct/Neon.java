class Neon
{
	public static void main(String[] args)
	{
		int a = 9;
		
		int b = a*a;
		int c = b%10;
		int d = b/10;
		int e = (c + d);
		
		boolean f = (a==e);
		System.out.println(f);
	}
}