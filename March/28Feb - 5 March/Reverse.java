import java.util.*;
class Reverse
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int rev=0;
		while(a>0)
		{
			rev=(rev*10)+a%10;
			a/=10;
		}
		System.out.println(rev);
	}
}