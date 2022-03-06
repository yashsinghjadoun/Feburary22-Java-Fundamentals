import java.util.*;
class Max
{
	static int Max(int a,int b)
	{
		if(a>b)return a;
		else return b;
	}
	static int Max(int a,int b,int c)
	{
		if(a>b && a>c)return a;
		else if(b>a && b>c)return b;
		else return c;
	}
	static int Max(int a,int b,int c,int d)
	{
		if((a>b && a>c)&& a>d)return a;
		else if((b>a && b>c)&& b>d)return b;
		else if((c>a && c>b)&& c>d)return c;
		else return d;
	}
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		System.out.println(Max(a,b));
		System.out.println(Max(a,b,c));
		System.out.println(Max(a,b,c,d));
	}
}