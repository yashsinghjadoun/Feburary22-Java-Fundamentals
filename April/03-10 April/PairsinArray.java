import java.util.*;
class PairsinArray
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter values of Array");
		for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		System.out.println("Enter number");
		int m=sc.nextInt();
		System.out.println("Pairs are");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)continue;
				else
				{
					if(arr[i]+arr[j]==m)System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
	}
}