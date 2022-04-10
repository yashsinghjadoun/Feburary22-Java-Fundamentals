import java.util.*;
class Amstrong
{
	static int square(int a,int b)
	{
		int mul=1;
		for(int i=0;i<=b-1;i++)mul*=a;
		return mul;
	}
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=n;
		int sum=0;
		int count=0;
		while(m>0)
		{
			count++;
			m/=10;
		}
		m=n;
		while(m>0)
		{
			int a=m%10;
			m/=10;
			sum=sum+square(a,count);
		}
		if(sum==n)System.out.println("The number is Amstrong");
		else System.out.println("The number is not Amstrong");
	}
}