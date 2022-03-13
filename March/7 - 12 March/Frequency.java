import java.util.*;
class Frequency
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rows");
		int n=sc.nextInt();
		System.out.println("Enter Column");
		int m=sc.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++)for(int j=0;j<m;j++)arr[i][j]=sc.nextInt();
		int oddcount=0,evencount=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(arr[i][j]%2==0)evencount++;
				else oddcount++;
			}
		}
		System.out.println("Oddcount = "+oddcount+" EvenCount = "+evencount);
	}
}