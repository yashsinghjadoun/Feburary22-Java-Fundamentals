import java.util.*;
class Add2Num
{
	static int add(int a,int b)
	{
		return a+b;
	}
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(add(a,b));
	}
}