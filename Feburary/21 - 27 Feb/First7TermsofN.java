import java.util.*;
class First7TermsofN
{
	public static void main(String ar[])
	{
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=1;count<=6;i++)
		{
			int num=(n*i)*n;
			if(num%6==0)
			{
				System.out.println(num);
				count++;
			}
		}
	}
}