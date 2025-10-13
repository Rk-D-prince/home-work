class Armstrong
{
	public static void main(String[] args)
	{
		int a = 370;
		int b = a;
		
		int c = a%10;
		int d = a/10;
		int e = d%10;
		int f = d/10;
		
		
		int g = (c*c*c)+(e*e*e)+(f*f*f);
		boolean h = (b==g);
		
		System.out.println(h);
	}
}