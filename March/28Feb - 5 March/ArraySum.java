import java.util.*;
class ArraySum
{
	public static void main(String ar[])
	{
		System.out.println("Enter size of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int arr[]=new int[n];
		System.out.println("Enter elements of array");
		for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		for(int i=0;i<n;i++)sum+=arr[i];
		System.out.println();
		System.out.println(sum);
	}
}