import java.util.*;
class Multi2Num
{
	static int Multi()
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		return a*b;
	}
	static float MultiFloat()
	{
		Scanner sc=new Scanner(System.in);
		float a=sc.nextInt();
		float b=sc.nextInt();
		return a*b;
	}
	static long MultiLong()
	{
		Scanner sc=new Scanner(System.in);
		long a=sc.nextInt();
		long b=sc.nextInt();
		return a*b;
	}
	public static void main(String ar[])
	{	
		System.out.println(Multi());
	}
}