import java.util.*;
class Swap
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Before Swapping\na="+a+"\nb="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Before Swapping\na="+a+"\nb="+b);
	}
}